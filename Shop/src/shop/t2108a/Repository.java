package shop.t2108a;
import shop.t2108a.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Repository {
    List<Product> listProducts = new ArrayList<>();
    public Repository(){
        listProducts.add(new Product("01","Bánh doraemon 3 vị ",Category.FOOD, 100, 3500,57));
        listProducts.add(new Product("02","Xúc xích sườn non",Category.FOOD, 150, 3500,12 ));
        listProducts.add(new Product("03" , "Thanh cua ",Category.FOOD, 100, 5000, 85));
        listProducts.add(new Product("04", " Bánh khoai môn" ,Category.FOOD,200, 42000, 78 ));
        listProducts.add( new Product("05","Thía ăn cơm inox mạ vàng", Category.HOUSEWARE , 50 , 800 , 4));
        listProducts.add(new Product("06","Bát đựng gia vị",Category.HOUSEWARE,65, 400, 44));
        listProducts.add(new Product("07","Nước Hoa Hông Soothing Facial Toner Simple",Category.COSMETICS,140, 92000, 88));
        listProducts.add(new Product("08", "Combo gội xả HAIRBURST",Category.COSMETICS,100 ,639000, 7));
        listProducts.add(new Product("09","Tinh chất dưỡng ẩm sâu KlairisRich Moist Soothing Serum", Category.COSMETICS,50, 249000,24));
        listProducts.add(new Product("10","Kem dương Paula's Choice RESIST WEIGHTLESS BODY TREATMENT",Category.COSMETICS,80,715000,63));
        listProducts.add(new Product("11","Ao thun TSUN",Category.FASHION,250, 320000,144));

    }
    public void show(){
        listProducts.forEach(product -> System.out.println(product));
    }
    public void sortProductByName(){
        listProducts.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

    }
    public void filterProductByPrice() {
        listProducts.stream()
                .filter(product -> product.getPrice() > 10000)
                .forEach(product -> System.out.println(product));


    }
    public void countProductByAmountSale(){
        long count = listProducts.stream()
                .filter(product -> product.getAmount() >= 50)
                .count();
        System.out.println("Số lượng sản phẩm bán được từ 50 trở lên là " +count);
    }



}

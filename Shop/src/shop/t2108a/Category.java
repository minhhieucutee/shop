package shop.t2108a;
/**
 * Category
 */
public enum Category {
    FOOD("Thực phẩm "), HOUSEWARE ("Đồ gia dung "),COSMETICS("mỹ phẩm"),FASHION ("Thời trang");
    private String value;
    private Category(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}

package lv.jg.lesson3.homework3;

public class ProductTest {
    public static void main(String[] args) {

        Product product = new Product();
        product.setName("milk");
        product.setRegularPrice(0.8);
        product.setDiscount(20);

        System.out.println("Product : name = " + product.getName() +
                ", regular price = " + product.getRegularPrice() +
                " EUR, discount = " + product.getDiscount() +
                "%, actual price = " + product.calculateActualPrice() + " EUR");
    }
}

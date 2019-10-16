package lv.jg.lesson3.homework3;

public class Product {
    private String name;
    private double regularPrice, discount;


    String getName() { return this.name; }
    double getRegularPrice() { return this.regularPrice; }
    int getDiscount() { return (int) this.discount; }

    public void setName(String name) { this.name = name; }
    public void setRegularPrice(double regularPrice) { this.regularPrice = regularPrice; }
    public void setDiscount(double discount) { this.discount = discount; }

    double calculateActualPrice() { 
        return regularPrice - regularPrice * discount / 100;
    }
}



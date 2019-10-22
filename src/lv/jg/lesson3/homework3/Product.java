package lv.jg.lesson3.homework3;

//OK
//izmanto "ctrl + alt + l"
public class Product {
    private String name;
    private double regularPrice, discount;

   //ja metodei ir jābūt pieejamai citiem objektiem, tad definejam to "public", ja nē tad "private"
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



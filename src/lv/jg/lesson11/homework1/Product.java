package lv.jg.lesson11.homework1;

public class Product {
	
	private String name;
    private double price;
    private Category  category;

    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category  = category;
    }
    
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", category=" + category +
                '}';
    }

    public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public Category getCategory() {
		return category;
	}
}

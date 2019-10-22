package lv.jg.lesson3.homework1;

//OK
public class Circle {
	private double radius;

	//metodi šajā gadījumā jādefinē kā "public"
	double getRadius() {
		return radius;

	}

	public void setRadius(double radius) {
		this.radius = radius;

	}

	//metodi šajā gadījumā jādefinē kā "public"
	double calculateArea() {
		return 3.14 * radius * radius;

	}

}

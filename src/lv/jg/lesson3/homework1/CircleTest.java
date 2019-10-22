package lv.jg.lesson3.homework1;

//OK
public class CircleTest {

	public static void main(String[] args) {

		Circle circle = new Circle();
		circle.setRadius(5);

		double circleArea = circle.calculateArea();
		double radius = circle.getRadius();

		System.out.println("Aplim ar r?diusu " + radius + " "
				+ "laukums ir " + circleArea);

	}

}

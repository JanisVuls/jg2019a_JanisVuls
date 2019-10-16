package lv.jg.lesson3.homework2;

public class CarTest {
	public static void main(String[] args) {
		
		Car car = new Car();
		car.setColor("melns ");
		car.setManufacturer("bembis");
		car.setYear(2009);
		
		String carColor = car.getColor();
		String carManufacturer = car.getManufacturer();
		int carYear = car.getYear();
	
		
		System.out.println("Art?ram ir " + carColor +
				carYear + " gada " + carManufacturer);
			
	}

}

package lv.jg.lesson8.homework1;

public class CarTest {
	
	public static void main(String[] args) {
	
		Car car = new Car("Mazda", 5);
		PasangerCar pasangerCar = new PasangerCar("Toyota", 5, 5);
		Lorry lorry = new Lorry("VAZ", 2, 1);
		Bus bus = new Bus("SOLARIS", 20, 10);
	
		System.out.println(car);
		System.out.println(pasangerCar);
		System.out.println(lorry);
		System.out.println(bus);
	
	}

}

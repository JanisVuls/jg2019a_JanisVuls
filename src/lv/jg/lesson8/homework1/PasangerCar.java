package lv.jg.lesson8.homework1;

public class PasangerCar extends Car{

	protected int doors; 
	
	public PasangerCar(String manufacturer, int seats, int doors) {
		super(manufacturer, seats);
		this.doors = doors;
		
	}
	
	@Override
	 public String toString() {
		 return "PasangerCar {" + 
				 "manufacturer ='" + manufacturer + '\'' + 
				 ", seat count=" + seats + 
				 ", door count=" + doors +
				 '}';
	 }

}

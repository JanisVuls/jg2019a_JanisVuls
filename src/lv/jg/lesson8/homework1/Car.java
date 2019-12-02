package lv.jg.lesson8.homework1;

public class Car {

	//šiem jābūt inkapsulētiem - private
	//piekļuve tikai izmantojot public geterus un seterus
	protected String manufacturer;
	protected int seats;
	
	public Car(String manufacturer, int seats) {
		 this.manufacturer = manufacturer;         
		 this.seats = seats;         
		 }   
	 
	 @Override
	 public String toString() {
		 return "Car {" + 
				 "manufacturer ='" + manufacturer + '\'' + 
				 ", seat count=" + seats + 
				 '}';
	 }
	
}

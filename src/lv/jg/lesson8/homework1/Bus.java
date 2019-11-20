package lv.jg.lesson8.homework1;

public class Bus extends Car{

	protected int standingPlaces; 
	
	public Bus(String manufacturer, int seats, int standingPlaces) {
		super(manufacturer, seats);
		this.standingPlaces = standingPlaces;
		
	}
	
	@Override
	 public String toString() {
		 return "Bus {" + 
				 "manufacturer ='" + manufacturer + '\'' + 
				 ", seat count=" + seats + 
				 ", standing places count=" + standingPlaces +
				 '}';
	 }

}

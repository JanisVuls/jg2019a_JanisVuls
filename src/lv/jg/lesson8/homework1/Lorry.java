package lv.jg.lesson8.homework1;

public class Lorry extends Car{

	//šiem jābūt inkapsulētiem - private
	//piekļuve tikai izmantojot public geterus un seterus
	protected int beds;
	
	public Lorry(String manufacturer, int seats, int beds) {
		super(manufacturer, seats);
		this.beds = beds;
		
	}
	
	@Override
	 public String toString() {
		 return "Lorry {" + 
				 "manufacturer ='" + manufacturer + '\'' + 
				 ", seat count=" + seats + 
				 ", bed count=" + beds +
				 '}';
	 }

}

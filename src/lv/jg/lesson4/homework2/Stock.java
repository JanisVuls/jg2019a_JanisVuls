package lv.jg.lesson4.homework2;

public class Stock {

	//laukiem ir jābūt iekapsulētiem - private
	String company;
	double currentValue;
	double max;
	double min;

	public Stock(String company, double currentValue) {
		this.company = company;
		this.currentValue = currentValue;
		max = currentValue;
		min = currentValue;
	}

	//šeit updatePrice ir japadod tikai viens parametrs - updateValue
	//metode tiek izsaukta no "testa" klases vairakas reizes
	public void updatePrice(double updatedValue1, double updatedValue2, double updatedValue3) {
		currentValue = updatedValue1;
		CalcMin();
		CalcMax();
		currentValue = updatedValue2;
		CalcMin();
		CalcMax();
		currentValue = updatedValue3;
		CalcMin();
		CalcMax();
	}

	//metode nosaukumiem mazie burti
	public void CalcMax() {
		if (currentValue > max) {
			max = currentValue;
		}
	}

	//metode nosaukumiem mazie burti
	public void CalcMin() {
		if (currentValue < min) {
		min = currentValue;
		}
		
	}

	public void printInformation() {
		System.out.println(company + " stock:");
		System.out.println("currentValue = " + currentValue);
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
	}

}

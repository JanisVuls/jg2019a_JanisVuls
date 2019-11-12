package lv.jg.lesson6.homework1;

public class NumberService {

	private int boundary1, boundary2;
	private int i, j;
	private int sum, evenNumberCount;
	
	NumberService (int boundary1, int boundary2) {
		this.boundary1 = boundary1;
		this.boundary2 = boundary2;
	}
	
	public void sumInRange() {
		if (boundary1 <= boundary2) {
			i = boundary1;
			j = boundary2;
			while (i <= j) {
				sum = sum + i;	
				i++; 
			}
		} else {
			i = boundary1;
			j = boundary2;
			while (j <= i) {
				sum = sum + j;	
				j++; 
			}
		}
		System.out.println("Sum = " + sum + "; ");
	}
	
	public void getEvenNumberCount() {
		if (boundary1 <= boundary2) {
			i = boundary1;
			j = boundary2;
			while (i <= j) {
				if (i % 2 == 0) {
					evenNumberCount++;	
				}
				i++; 
			}
		} else {
			i = boundary1;
			j = boundary2;
			while (j <= i) {
				if (j % 2 == 0) {
					evenNumberCount++;
				}
				j++;
			}
		}
		System.out.println("Even number count = " + evenNumberCount + "; ");
	}
}

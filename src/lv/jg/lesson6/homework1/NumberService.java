package lv.jg.lesson6.homework1;

public class NumberService {

	//šajā klasē nekādu stāvokli nav nepieciešams glabāt
	//jo metode paredz ka šie stāvokļiem ir jābūt jauniem, kad tās (metodes) tiek izsauktas
	private int boundary1, boundary2;
	private int i, j;
	private int sum, evenNumberCount;

	//robežām ir jābūt nodotām kā parametriem "sumInRange" un "getEvenNumberCount" klasē
	NumberService (int boundary1, int boundary2) {
		this.boundary1 = boundary1;
		this.boundary2 = boundary2;
	}

	//metodei ir jātdod rezultāts, nevis jāizvada konsolē - to var darīt tests
	public void sumInRange() {
		if (boundary1 <= boundary2) {
			i = boundary1;
			j = boundary2;
			//tā kā šī daļa mums atkātojas, tad to varam iznest metodē
			//kurai varam padot 2 mainīgos
			//tas nozīmē, ka ar if varma noteikt kādā secībā iedodam tos
			while (i <= j) {
				sum = sum + i;	// lietojam īso pierakstu "sum =+ i"
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

	//skatīt iepriekšējās metodes komentārus
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

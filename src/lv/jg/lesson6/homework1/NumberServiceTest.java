package lv.jg.lesson6.homework1;

public class NumberServiceTest {

	//vajadzētu lietot tomēr atsevišķās metodes ar nosaukumiem, kas apraksta katru teesta gadījumu
	public static void main(String[] args) {
		
		NumberService myRange = new NumberService(2,5);
		myRange.sumInRange();
		myRange.getEvenNumberCount();
		NumberService yourRange = new NumberService(10,5);
		yourRange.sumInRange();
		yourRange.getEvenNumberCount();
	}

}

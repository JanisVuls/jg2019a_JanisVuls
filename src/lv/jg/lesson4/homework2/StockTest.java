package lv.jg.lesson4.homework2;

public class StockTest {
	public static void main(String[] args) {
		
		Stock ibm = new Stock("IBM",150);
		ibm.updatePrice(150.37, 149.82, 150.12);

//		šādi tam būtu jabūt
//		ibm.updatePrice(150.37);
//		ibm.updatePrice(149.82);
//		ibm.updatePrice(150.12);

		ibm.printInformation();
}

}

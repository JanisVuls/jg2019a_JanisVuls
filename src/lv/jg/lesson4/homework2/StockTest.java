package lv.jg.lesson4.homework2;

public class StockTest {
    public static void main(String[] args) {

        Stock ibm = new Stock("IBM",150);
        double getCurrentValue = ibm.updatePrice(150.37,149.82,150.12);

        System.out.println(ibm.printInformation());

        System.out.println("currentValue = " + getCurrentValue);
        System.out.println("Max = " + ibm.getMax(150.37,149.82,150.12));
        System.out.println("Min = " + ibm.getMin(150.37,149.82,150.12));
    }
}



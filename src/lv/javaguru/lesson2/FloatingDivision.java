package lv.javaguru.lesson2;

public class FloatingDivision {
    public static void main(String[] args) {

        int a, b, resultIntDiv;
        double resultDoubleDiv, resultCastingDiv, resultCastingDiv2;

        a = 10;
        b = 4;

        resultIntDiv = a / b;
        resultDoubleDiv = a / b;
        resultCastingDiv = a / (double) b;


        System.out.println(resultIntDiv + ", " + resultDoubleDiv + ", " + resultCastingDiv);
        System.out.println(10 + resultIntDiv + ", " + resultDoubleDiv + ", " + resultCastingDiv);

        resultCastingDiv2 = (double) a / b;
        System.out.println(resultCastingDiv2);
    }
}

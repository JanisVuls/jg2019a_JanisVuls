package lv.jg.lesson4.classwork.conditonalFlowControl;

public class ComplexBooleanStatement {
    public static void main(String[] args) {

        int x = 10;

//(x > 5) - Statement1 - Check if x is greater than 5
//&& - Conditional AND - Make sure that BOTH statements are true
//(x < 15) - Statement2 - Check if x is lesser than 15
        if ((x > 5) && (x < 15)) {
            System.out.println("Within bounds!");
        }
    }
}

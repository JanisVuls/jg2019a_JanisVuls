package lv.jg.lesson4.classwork.conditonalFlowControl;

public class IfElseIfStatement {
    public static void main(String[] args) {

        boolean flag1 = false;
        boolean flag2 = true;

        if (flag1) {
            System.out.println("Flag1");
            //Code to execute when statement1 is true
        } else if (flag2) {
            //Code to execute when statement1 is true
            System.out.println("Flag2");
        }

        int x = 7;

        if (x == 3)
            System.out.println("x == 3");
        else if (x == 7)
            System.out.println("x == 7");
    }
}

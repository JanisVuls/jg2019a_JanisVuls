package lv.jg.lesson4.classwork.conditonalFlowControl;

public class IfElseIfElseStatement {
    public static void main(String[] args) {

        boolean flag1 = false;
        boolean flag2 = false;

        if (flag1) {
            System.out.println("Flag1");
        } else if (flag2) {
            System.out.println("Flag2");
        } else {
            System.out.println("none");
            //Code to execute
            //when all statements are false
        }
        int x = 7;

        if (x == 3) {
            System.out.println("x == 3");
        } else if (x == 7) {
            System.out.println("x == 7");
        } else {
            System.out.println("NOTA");
        }



    }
}

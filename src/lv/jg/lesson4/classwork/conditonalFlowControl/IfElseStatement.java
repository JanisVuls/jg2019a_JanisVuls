package lv.jg.lesson4.classwork.conditonalFlowControl;

public class IfElseStatement {
    public static void main(String[] args) {

        boolean flag = false;

        if (flag) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        int x = 5;

        if (x > 10) {
            System.out.println("x > 10");
// else - Keyword specifying alternative code block
        } else {
            //Code to execute when statement is false
            System.out.println("x =< 10");
        }
    }
}

package lv.jg.lesson4.classwork.conditonalFlowControl;

public class IfStatement {
    public static void main(String[] args) {
        //Boolean variable expression

        boolean flag = true;

//if - Keyword specifying conditional statement
//(flag) - Variable or expression with boolean result
        if (flag) {
            //Code to execute when statement is true
            System.out.println("True");
        }

        //Inline expression

        int x = 5;

        if (x > 10) {
            System.out.println("x > 10");
        }
    }
}

package lv.jg.homework.lesson2;

public class MathOperations {
    public static void main(String[] args) {
        int firstNumber = 33, secondNumber = 69,
                sum, sub, mul, divInt;
        double divDouble, divCast;

        sum = firstNumber + secondNumber;
        sub = firstNumber - secondNumber;
        mul = firstNumber * secondNumber;
        divInt = firstNumber / secondNumber;
        divDouble = firstNumber / secondNumber;
        divCast = (double) firstNumber / secondNumber;

        System.out.println(" ");
        System.out.println("Sum = " + sum +
                "   Subtraction = " + sub +
                "   Multiplication = " + mul);
        System.out.println(" ");
        System.out.println("Division int = " + divInt);
        System.out.println("Division double = " + divDouble);
        System.out.println("Division casted = " + divCast);

    }
}

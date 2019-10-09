package lv.jg.classwork.lesson2;

import java.util.Scanner;

public class TriangleAreCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter triangle height");
        double height = scanner.nextDouble();
        System.out.println("Please enter triangle width");
        double width = scanner.nextDouble();
        double area = height * width / 2;

        System.out.println("Area: "  + area);

    }

}

package lv.jg.homework.lesson2;

import java.util.Random;

public class RandomNumbersServiceTest {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int randomNr1 = randomGenerator.nextInt(101),
                randomNr2 = randomGenerator.nextInt(101),
                randomNr3 = randomGenerator.nextInt(101),
                sum = randomNr1 + randomNr2 + randomNr3;
        System.out.println(randomNr1 + " + " +
                randomNr2 + " + " + randomNr3 + " = " + sum);

    }
}

package lv.jg.lesson2.homework;

import java.util.Random;

public class RandomNumbersServiceTest {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        //tas pats kas ieptiekš, šāds pieraksts nav pats ērtākais. labak tad definēt atsevišķi
        int randomNr1 = randomGenerator.nextInt(101),
                randomNr2 = randomGenerator.nextInt(101),
                randomNr3 = randomGenerator.nextInt(101),
                sum = randomNr1 + randomNr2 + randomNr3;
        System.out.println(randomNr1 + " + " +
                randomNr2 + " + " + randomNr3 + " = " + sum);

    }
}

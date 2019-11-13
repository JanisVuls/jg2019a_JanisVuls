package lv.jg.lesson7.homework1;

import java.util.Random;

public class ArrayService {

    ArrayService () {
    }
    
    public int[] create(int size) {
    	 return new int[size];
    	 }


    public void fillArrayWithRandomNumbers(int[] array) {
    	 Random randomGenerator = new Random();
    	  for (int i = 0; i < array.length; i++) {
    	 array[i] = randomGenerator.nextInt(101);
    	 }
    }

    public void printArrayToConsole(int[] array) {
    	    System.out.print("Numbers in array: "); 
    	for (int numbersInArray : array) {
    		System.out.print(numbersInArray+ ", ");
    	 }
    }

    public void sumInArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum = " + sum + "; ");
    }
}
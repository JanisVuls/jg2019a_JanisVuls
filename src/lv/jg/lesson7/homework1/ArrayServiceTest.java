package lv.jg.lesson7.homework1;

public class ArrayServiceTest {

    public static void main(String[] args) {
    
    ArrayService myArray= new ArrayService();
    int[] array = myArray.create(3);
    myArray.fillArrayWithRandomNumbers(array);
    myArray.printArrayToConsole(array);
    myArray.sumInArray(array);
   }
}


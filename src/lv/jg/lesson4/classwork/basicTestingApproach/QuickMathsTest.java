package lv.jg.lesson4.classwork.basicTestingApproach;

public class QuickMathsTest {
    //Instantiate QuickMathsTest class
    public static void main(String[] args) {
        //Call test1 method
        QuickMathsTest testRunner = new QuickMathsTest(); //Why is this needed???
        testRunner.test1();       //Can't we start from calling QuickMaths method (line 13)???
    }                             //and make check method static???
// TEST and VERIFICATION methods
    public void test1() {
        //Call QuickMaths class that returns max number
        QuickMaths victim = new QuickMaths();
                 //victim - new object  // Why call it victim???
        int a = 3; //Why is this needed???
        int b = 5; //Why is this needed???
        int expectedResult = 5;
            //actualResult - Return of QuickMaths max
        int actualResult = victim.max(3, 5);
                                    //(3, 5) - set variable in QuickMaths max
        //Call method check
        check(actualResult, expectedResult, "test1");
             //set parameters in check method
    }

    //method to verify that method max works as expected
    public void check(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }
}
package lv.jg.lesson4.classwork.basicTestingApproach;

//class that returns max number from two given numbers
public class QuickMaths {
    //(int a, int b) - integrated setters
    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}


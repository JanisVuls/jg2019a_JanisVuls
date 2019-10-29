package lv.jg.lesson5.homework3;

public class TVControllerTest {
    public static void main(String[] args) {

        TV myTV = new TV("Samsung");

        TVController myTVController = new TVController();
        myTVController.setTv(myTV);

        System.out.println(myTVController);

        myTV.nextChannel();
        myTV.previousChannel();
        myTV.turnOn();
        myTV.nextChannel();
        myTV.previousChannel();
        myTV.previousChannel();
        myTV.nextChannel();
        myTV.turnOff();
        myTV.increaseVolume();
        myTV.decreaseVolume();
        myTV.mute();
        myTV.turnOn();
        myTV.increaseVolume();
        myTV.increaseVolume();
        myTV.decreaseVolume();
        myTV.mute();
        myTV.increaseVolume();
        myTV.decreaseVolume();
        myTV.decreaseVolume();
    }
}

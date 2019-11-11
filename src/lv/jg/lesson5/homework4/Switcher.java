package lv.jg.lesson5.homework4;

public class Switcher {
    private LightBulb lightBulb;
    private boolean turnedOn;

    public void switchOnOff() {
        if (turnedOn == true) {
            turnedOn = false;
            System.out.println("Switcher is OFF");
            lightBulb.turnOff();
        } else {
            turnedOn = true;
            System.out.println("Switcher is ON");
            lightBulb.turnOn();
        }

    }


// trūkst connect, ar to būtu jāpadod un jāieseto "LightBulb" objekts





    @Override
    public String toString() {
        return "Switcher{" +
                "turnedOn=" + turnedOn +
                ", lightBulb=" + lightBulb +
                '}';
    }

    public LightBulb getLightBulb() {
        return lightBulb;
    }

    public void setLightBulb(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }
}

package lv.jg.lesson5.homework4;

//šeit MAX_TURN_ON_COUNT ir jābūt konstantei
public class LightBulb {
    private boolean turnedOn;
    private int currentTurnOnCount;

    public void turnOff() {
        turnedOn = false;
        System.out.println("Light is OFF");;
    }
    public void turnOn() {
        if (currentTurnOnCount < 5) {
            turnedOn = true;
            currentTurnOnCount++;
            System.out.println("Light is ON");
        } else {
            currentTurnOnCount = 5;
            System.out.print("MAX_TURN_ON_COUNT Reached     ");
            turnOff();
        }
    }

    @Override
    public String toString() {
        return "LightBulb{" +
                "turnedOn=" + turnedOn +
                ", currentTurnOnCount=" + currentTurnOnCount +
                '}';
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public int getCurrentTurnOnCount() {
        return currentTurnOnCount;
    }

    public void setCurrentTurnOnCount(int currentTurnOnCount) {
        this.currentTurnOnCount = currentTurnOnCount;
    }
}

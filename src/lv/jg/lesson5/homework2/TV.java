package lv.jg.lesson5.homework2;

public class TV {

	private int currentChannel, currentVolumeLevel;
	private String manufacturer;
	private boolean turnedOn;

	public int getCurrentVolumeLevel() {
		return currentVolumeLevel;
	}
	public void increaseVolume() {
		if (turnedOn == true) {
			currentVolumeLevel++;
			System.out.println("Volume level " + getCurrentVolumeLevel());
		}
		onOrOff();
	}
	public void decreaseVolume() {
		if (turnedOn == true) {
			currentVolumeLevel--;
			if (currentVolumeLevel < 0)
				currentVolumeLevel = 0;
			System.out.println("Volume level " + getCurrentVolumeLevel());
		}
		onOrOff();
	}
	public void mute() {
		if (turnedOn == true) {
			currentVolumeLevel = 0;;
			System.out.println("MUTE");
		}
		onOrOff();
	}
	public int getCurrentChannel() {
		return currentChannel;
	}

	public void nextChannel() {
		if (turnedOn == true) {
			currentChannel++;
			if (currentChannel > 3)
				currentChannel = 0;
			System.out.println("Channel " + getCurrentChannel());
		}
		onOrOff();
	}
	public void previousChannel() {
		if (turnedOn == true) {
			currentChannel--;
			if (currentChannel < 0)
				currentChannel = 3;
			System.out.println("Channel " + getCurrentChannel());
		}
		onOrOff();
	}

	public void turnOff() {
		turnedOn = false;
		onOrOff();
	}
	public void turnOn() {
		turnedOn = true;
			System.out.println("TV is ON");
		onOrOff();
	}

	public void onOrOff() {
        if (turnedOn == true) {
        } else {
        	System.out.println("TV is OFF");
        }
    }

}

package lv.jg.lesson5.homework3;

import java.util.Objects;

public class TV {

	private int currentChannel, currentVolumeLevel;
	private String manufacturer;
	private boolean turnedOn;

	TV(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		TV tv = (TV) o;
		return Objects.equals(manufacturer, tv.manufacturer);
	}
	@Override
	public String toString() {
		return "TV{"
				+ "Manufacturer='" + manufacturer + '\'' + '}';
	}

	public int getCurrentVolumeLevel() {
		return currentVolumeLevel;
	}
	public void increaseVolume() {
		if (turnedOn == true) {
			currentVolumeLevel++;
			System.out.println("Volume level " + getCurrentVolumeLevel());
		} else {
			System.out.println("TV is OFF");
		}
	}
	public void decreaseVolume() {
		if (turnedOn == true) {
			currentVolumeLevel--;
			if (currentVolumeLevel < 0)
				currentVolumeLevel = 0;
			System.out.println("Volume level " + getCurrentVolumeLevel());
		} else {
			System.out.println("TV is OFF");
		}
	}
	public void mute() {
		if (turnedOn == true) {
			currentVolumeLevel = 0;
			System.out.println("MUTE");
		} else {
			System.out.println("TV is OFF");
		}
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
		} else {
			System.out.println("TV is OFF");
		}
	}
	public void previousChannel() {
		if (turnedOn == true) {
			currentChannel--;
			if (currentChannel < 0)
				currentChannel = 3;
			System.out.println("Channel " + getCurrentChannel());
		} else {
		System.out.println("TV is OFF");
		}
	}

	public void turnOff() {
		turnedOn = false;
		System.out.println("TV is OFF");
	}
	public void turnOn() {
		turnedOn = true;
			System.out.println("TV is ON");
	}
}

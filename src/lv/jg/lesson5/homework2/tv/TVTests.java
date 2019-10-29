package lv.jg.lesson5.homework2.tv;

public class TVTests {
	
	public static void main(String[] args) {
		
		TV myTV = new TV("Samsung");
		TV yourTV = new TV("Panasonic");

		if (myTV.equals(myTV)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (myTV.equals(yourTV)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		System.out.println(myTV);


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

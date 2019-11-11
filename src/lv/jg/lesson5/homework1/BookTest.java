package lv.jg.lesson5.homework1;

public class BookTest {

	public static void main(String[] args) {

		Book myBook = new Book("Rainis", "Uguns un Nakts", 3333);
		Book yourBook = new Book("Aspazija", "Kakucis", 545);

		//lab
		if (myBook.equals(myBook)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if (myBook.equals(yourBook)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		System.out.println(myBook);
		
	}

}

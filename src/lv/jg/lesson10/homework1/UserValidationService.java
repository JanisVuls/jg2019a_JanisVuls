package lv.jg.lesson10.homework1;

public class UserValidationService {

	public static void main(String[] args) {
        shouldCreateUser();
        shouldFailIfInputValueToSmall();
        shouldFailIfInputValueToLarge();
}

	private static void shouldCreateUser() {
        User user = new User("Maksims", "Maisins", 1111);
	}

	private static void shouldFailIfInputValueToSmall() {
        System.out.println("================");
        boolean result = false;
        try {
        	User user = new User("Ma", "Maisins", 0);
        } catch (IllegalArgumentException ex) {
            result = true;
        }
        System.out.println("Test: shouldFailIfInputValueToSmall");
        System.out.println(result ? "SUCCESS" : "FAILED");
    }
		
	private static void shouldFailIfInputValueToLarge() {
        System.out.println("================");
        boolean result = false;
        try {
        	User user = new User("Maksims", "Maisins123456789", 120);
        } catch (IllegalArgumentException ex) {
            result = true;
        }
        System.out.println("Test: shouldFailIfInputValueToLarge");
        System.out.println(result ? "SUCCESS" : "FAILED");
    }

	}

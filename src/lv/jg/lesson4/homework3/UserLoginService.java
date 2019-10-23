package lv.jg.lesson4.homework3;
public class UserLoginService {
	
	public static void main(String[] args) {
		User user1 = new User("Aleks");
		login("pica", user1);
		login("Pica", user1);
		login("pia", user1);
		login("pica", user1);
		login("pizza", user1);
		login("pissa", user1);
		login("pissa", user1);
		login("pissa", user1);
	}

	public static void login(String inputPassword, User user) {
		if (user.block() == true) {
			System.out.println(" Account is blocked");
		} else {
			user.setPassword(inputPassword);
			verify(user);
		}
	}

	public static void verify(User user) {
		if (user.compare() == true) {
			user.resetLoginAttempts();
			System.out.println("You are logged in.");
			System.out.println("---------========----------");
		} else {
			user.LoginAttemptsLeft();
			System.out.println(" Something is not right... ");
			System.out.println(user.getLoginAttemptsLeft() + " attempts left");
			System.out.println("---------========----------");
		}
	}
}

package lv.jg.lesson4.homework3;

public class UserLoginService {
	
		public static void main(String[] args) {
			
			User user1 = new User("Aleks");
			login("pica", user1);
			login("Pica", user1);
						
	}

		public static void login(String inputPassword, User user) {
			user.setPassword(inputPassword);
			verify(user);
			
		}

		public static void verify(User user) {
			if (user.compare() == true) {
				System.out.println("You are logged in.");
			} else {
				System.out.println("Something is not right...");
			}
			
			
		}

		
		
}

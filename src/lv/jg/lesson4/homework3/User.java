package lv.jg.lesson4.homework3;

public class User {

	private String login;
	private String password;
	private int loginAttemptsLeft = 3;
	private boolean blocked;
	
	public void setPassword(String password) {
		this.password = password;
	}

	public User(String login) {
		this.login = login;
	}

	public void LoginAttemptsLeft() {
		loginAttemptsLeft = loginAttemptsLeft - 1;
	}

	public int getLoginAttemptsLeft() {
		return loginAttemptsLeft;
	}
	public int resetLoginAttempts() {
		return loginAttemptsLeft = 3;
	}

	public boolean block() {
		if (loginAttemptsLeft == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean compare() {
		if (password == "pica" && login == "Aleks") {
			return true;
		} else {
			return false;
		}
	}
}

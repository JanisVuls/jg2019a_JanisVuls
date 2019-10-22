package lv.jg.lesson4.homework3;

public class User {

	private String login;
	private String password;
	private int loginAttemptsLeft = 3;
	private double blocked;

	
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getLoginAttemptsLeft() {
		return loginAttemptsLeft;
	}

	public void setLoginAttemptsLeft(int loginAttemptsLeft) {
		this.loginAttemptsLeft = loginAttemptsLeft;
	}

	public double getBlocked() {
		return blocked;
	}

	public void setBlocked(double blocked) {
		this.blocked = blocked;
	}

	public User(String login) {
		this.login = login;
	}

	public void resetLoginAttempts() {
		loginAttemptsLeft = 3;

	}

	public void block() {

	}

	public boolean compare() {
		if (password == "pica" && login == "Aleks"){
			return true;
		} else {
			return false;
		}

	}

}

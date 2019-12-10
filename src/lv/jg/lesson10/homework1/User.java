package lv.jg.lesson10.homework1;

public class User {

	private String name;
	private String lastName;
	int age;

	//validāciju labak iznest atsevišķā metodē un tai bija jabūt servisa klasē
	public User(String name, String lastName, int age) {
        if (!isValidName(name)) {
            throw new IllegalArgumentException("Wrong input value for Name");
        }
        this.name = name;
        
        if (!isValidLastName(lastName)) {
            throw new IllegalArgumentException("Wrong input value for Last Name");
        }
        this.lastName = lastName;
        
        if (!isValidAge(age)) {
            throw new IllegalArgumentException("Wrong input value for Age");
        }
        this.age = age;
    }

    private boolean isValidName(String name) {
        return name.length() >= 3 && name.length() <= 15;
    }
    
    private boolean isValidLastName(String lastName) {
        return lastName.length() >= 3 && lastName.length() <= 15;
    }
    
    private boolean isValidAge(int age) {
        return age >= 0 && age <= 120;
    }

}

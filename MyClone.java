
//Create new class called MyClone
public class MyClone {

	// declare the variables
	private String firstName;
	private String lastName;
	private int myAge;

	// create constructor
	public MyClone() {
		// initialize the variables to nothing
		firstName = null;
		lastName = null;

	}

	// create overloaded constructor
	public MyClone(int age) {
		myAge = age;

	}

	// create Setters
	// method to set the first name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// method to set the last name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.myAge = age;
	}

	// Getters
	// get the first name
	public String getFirstName() {
		return firstName;
	}

	// get the last name
	public String getLastName() {
		return lastName;
	}

	// get the age
	public int getAge() {
		return myAge;
	}

	// create introduction method
	public void introduction() {
		// print the message
		System.out.printf("\n Well hello there!  Welcome to our world! \n Hello, my name is " + getFirstName() + " " + getLastName() + " and I am " + myAge + " years old. ");
	}
}

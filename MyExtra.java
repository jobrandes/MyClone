
//create extra class
public class MyExtra {

	// declare the instance variables
	private String profession;
	private String email;

	// create constructor (no return type)
	public MyExtra() {
		// initialize the instance variables with null values

		profession = null;
		email = null;

	}

	// create getters
	public String getProfession() {
		return profession;
	}

	public String getEmail() {
		return email;
	}

	// create setters
	public void setProfession(String profession) {
		this.profession = profession;
	}

	public void setEmail(String Email) {
		this.email = Email;
	}

	// method with return type as void
	public void ExtraDetails() {

		// print the extra stuff to the screen
		System.out.println("I am a " + getProfession() + " and you can email me at " + getEmail() + ".");
	}

}

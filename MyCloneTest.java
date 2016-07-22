
import java.util.Scanner;

//Test the MyClone class
class MyCloneTest {

	//create main method
	public static void main(String[] args) {
		
		// create a scanner objects
		Scanner input = new Scanner(System.in); 
		Scanner input2 = new Scanner(System.in); 

		//create variables 
		String firstName;
		String lastName;
		String profession;
		String mail;
		int age;

		//output to ask for first name and store as firstName
		System.out.print("Enter your first name: ");
		firstName = input.nextLine();

		//output to ask for last name and store as lastName
		System.out.print("\nEnter your last name: ");
		lastName = input.nextLine();

		//output to ask for age and store as age
		System.out.print("\nEnter your age: ");
		age = input2.nextInt();

		//output to ask for profession and store as profession
		System.out.print("\nEnter your profession: ");
		profession = input.nextLine();

		//output to ask for mail and store as mail
		System.out.print("\nEnter your email: ");
		mail = input.nextLine();

		// create new object
		MyExtra extraInfo = new MyExtra();
		MyClone myInfo = new MyClone();

		// check to make sure fields are required
		if (firstName.isEmpty() || lastName.isEmpty() || profession.isEmpty() || mail.isEmpty() || age == 0) {

			System.err.println("Error! All fields are required");
		} else {
			// use setters to set the new values
			myInfo.setFirstName(firstName);
			myInfo.setLastName(lastName);
			myInfo.setAge(age);
			extraInfo.setProfession(profession);
			extraInfo.setEmail(mail);

			// call the methods to display message
			myInfo.introduction();
			extraInfo.ExtraDetails();

		}
	}
}

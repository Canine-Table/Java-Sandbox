package myStore;

/** @author Table */

public class Person {

	private String firstName;
	private String lastName;
	private int phoneNumber;
	private String emailAddress;

	public Person(String firstName, String lastName,int phoneNumber,String emailAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public static void main(String[] args) {
		Person john = new Person("John", "Doe", 1234567890, "johndoe@algonquinlive.com");
		System.out.print(john.getName()+"\n");
		System.out.print(john.getPhoneNumber()+"\n");
		System.out.print(john.getEmailAddress()+"\n");

	}

}

import java.util.Scanner;
public class Name {

	Scanner input = new Scanner(System.in);
	
	String firstName;
	String middleName;
	String lastName;
	
	
	public Name(String firstName,String middleName,String lastName) {
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
		
	}
	
	public Name() {
		setName();
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		//System.out.println("Enter your first name");
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		//System.out.println("Enter your Middle name");
		if(middleName.isEmpty()) {
			
			this.middleName = "";
		}else{
			middleName = middleName.substring(0,1).toUpperCase() + middleName.substring(1);
			middleName = middleName + ".";
			this.middleName = middleName;
		}
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		//System.out.println("Enter your last name");
		this.lastName = lastName;
	}
	
	
	
	public String toString() {
		String result = null;
		firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
		lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
		
		if(middleName.isEmpty()) {
			result = firstName + " " + lastName;
		}else {
			result = firstName + " " + middleName + " " + lastName;
		}
		
		return result;
	}
	public void setName() {
		System.out.println("Enter your first name");
		String first = input.next();
		setFirstName(first);
		System.out.println("Enter your Middle name (press enter to skip)");
		input.nextLine();
		String middle = input.nextLine();
		setMiddleName(middle);
		System.out.println("Enter your last name");
		String last = input.next();
		setLastName(last);
		
	}
	
}

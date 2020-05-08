package Staff;

 

import java.util.Scanner;

 

public class Regularworker extends AdultStaff  {

	

	public Regularworker(StaffKind kind) {

		super(kind);

 

	}  

	

	public void getUserInput(Scanner input) {

		

		System.out.println("***Add the staff*** ");

		setStaffName(input);  

		setStaffagewithYN(input); 

		setStaffPhonenumber(input);  

		setStaffWorkhour(input);   

	}

	

	public void printinfo() {

		String skind = getKindString(); 

		System.out.print("kind: " + skind +", " + " name : " + name + ", " + "age : " + age + ", " + "phonenumer : " + phonenumber + ", "  

				+ " workhour : " + workhour + "\n\n");

	}

}
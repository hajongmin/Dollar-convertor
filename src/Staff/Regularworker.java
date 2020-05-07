package Staff;

 

import java.util.Scanner;

 

public class Regularworker extends AdultStaff  {

	

	public Regularworker(StaffKind kind) {

		super(kind);

 

	}  

	

	public void getUserInput(Scanner input) {

		

		System.out.println("***Add the staff*** ");

		setStaffName(input);  //추가

		setStaffagewithYN(input); //추가

		setStaffPhonenumber(input);  //추가 

		setStaffWorkhour(input);   //추가

	}

	

	public void printinfo() {

		String skind = getKindString(); //추가

		System.out.print("kind: " + skind +", " + " name : " + name + ", " + "age : " + age + ", " + "phonenumer : " + phonenumber + ", "  

				+ " workhour : " + workhour + "\n\n");

	}

}
package Staff;

 

import java.util.Scanner;

 

public class NonRegularworker extends Staff  {

	

	protected int parentphonenumber;

	

	public NonRegularworker(StaffKind kind) {

		super(kind);

 

	}  

	

	public void setPPhonenumber(int parentphonenumber) {

		this.parentphonenumber = parentphonenumber;

	}

 

	public void getUserInput(Scanner input) {

		System.out.println("***Add the staff*** ");

 

		setStaffName(input); 

		setStaffAge(input);  

		setStaffPhonenumber(input);  

		setStaffparentphonenum(input); 

		setStaffWorkhour(input);  

	}

	

	public void setStaffparentphonenum(Scanner input) { 

		char answer = 'x';   

		while (answer != 'y' && answer !='Y' && answer !='n' && answer !='N')

		{

			System.out.println("Do you have a parent's phonenumber? (Y/N)");

			answer = input.next().charAt(0);

			if(answer == 'y' || answer == 'Y')

			{

				System.out.println("parent's phone : ");

				int parentphonenumber = input.nextInt();

				setPPhonenumber(parentphonenumber); 

			}

 

			else if (answer == 'n' || answer == 'N')

			{

				this.setPPhonenumber(0);    

				break;

			}

 

			else {

 

			}

		}

	}

	public void printinfo() {

		String skind = getKindString(); 

		System.out.print("kind: " + skind +", " + " name : " + name + ", " + "age : " + age + ", " + "phonenumer : " + phonenumber + ", " +"parent's phonenumer : " + parentphonenumber 

				+ " workhour : " + workhour + "\n\n");

	}

}
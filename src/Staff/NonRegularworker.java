package Staff;

import java.util.Scanner;

import Exception.PhonenumFormatException;

public class NonRegularworker extends Staff  {

	protected String parentphonenumber;

	public NonRegularworker(StaffKind kind) {
		super(kind);

	} 

	public void setPPhonenumber(String parentphonenumber) throws PhonenumFormatException {
		if(!parentphonenumber.contains("-")) {
			throw new PhonenumFormatException();
		}
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
	public void strstaffTeenAge(Scanner input) {

	}

	public void setStaffparentphonenum(Scanner input) {
		char answer = 'x';  
		while (answer != 'y' && answer !='Y' && answer !='n' && answer !='N')
		{
			System.out.println("Do you have a parent's phonenumber? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y')
			{
				String parentphonenumber = "";             //추가
				while (!parentphonenumber.contains("-")) {
					try {
						System.out.println("parent's phone : ");
						parentphonenumber = input.next();
						setPPhonenumber(parentphonenumber);
					}
					catch(PhonenumFormatException e) {
						System.out.println("Incorrect Phonenum Format. put the phonenum that contains '-'");
					}
				}
			}

			else if (answer == 'n' || answer == 'N')
			{
				try {
					this.setPPhonenumber("");     //추가
				}
				catch (PhonenumFormatException e) {
					System.out.println("parent's phonenumer is null");
				}
				break;
			}

			else {

			}
		}
	}
	public void printinfo() {
		String skind = getKindString();
		System.out.print("kind: " + skind +", " + " name : " + name + ", " + "age : " + age + ", " + "phonenumer : " + phonenumber + ", " +"parent's phonenumer : " + parentphonenumber
				+", "+ " workhour : " + workhour + "\n\n");
	}
}
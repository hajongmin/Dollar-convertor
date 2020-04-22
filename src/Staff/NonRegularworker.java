package Staff;

import java.util.Scanner;

public class NonRegularworker extends Staff {
	
	protected int parentphonenumber;
	
	public NonRegularworker(StaffKind kind) {
		super(kind);

	}  
	
	public void setPPhonenumber(int parentphonenumber) {
		this.parentphonenumber = parentphonenumber;
	}

	public void getUserInput(Scanner input) {
		System.out.println("***Add the staff*** ");

		System.out.println("Name : ");
		String name = input.next();
		this.setName(name);

		System.out.println("Age : ");
		int age = input.nextInt();
		this.setAge(age);
		
		System.out.println("phone : ");
		int phonenumber = input.nextInt();
		this.setPhonenumber(phonenumber);
		
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
				this.setPPhonenumber(phonenumber);    
				break;
			}

			else {

			}
		}

		System.out.println("working hour : ");
		int workhour = input.nextInt();
		this.setWorkhour(workhour);
		
		

	}
	
	public void printinfo() {
		String skind = "none";
	
		switch(this.kind) {
		
		case Regularworker:
			skind = "Regular";
			break;
		
		case NonRegularworker:
			skind = "NonRegular";
			break;
		
		case Manager:
			skind = "Manager";
			break;
		default:	
		}
		
		System.out.print("kind: " + skind +", " + " name : " + name + ", " + "age : " + age + ", " + "phonenumer : " + phonenumber + ", " +"parent's phonenumer : " + parentphonenumber 
				+ " workhour : " + workhour + "\n\n");
	}
}

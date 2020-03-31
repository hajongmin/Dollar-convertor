import java.util.Scanner;

public class StaffManager {
	Staff staff;
	Scanner input;
	
	StaffManager(Scanner input)
	{
		this.input = input;
	}
	
	public void addstaff() {
		staff = new Staff();
		System.out.println("***Add the staff*** ");
		System.out.println("Name : ");
		staff.name = input.next();
		System.out.println("age : ");
		staff.age = input.nextInt();
		System.out.println("Phone number : ");
		staff.phonenumber = input.nextInt();
		System.out.println("working hour : ");
		staff.workhour = input.nextInt();
		
		
	}
	
	public void deletestaff() {
		System.out.println("***Delete the staff*** : ");
		System.out.println("Name : ");
		String staffname = input.next();
		
		if(staff == null) 
		{	
			System.out.println("staff Name has not been resisterd");
			return;
		}
		
		if(staff.name.equals(staff.name))
		{
			staff = null;
			System.out.println("staff Name is deleted ");
		}
	}
	
	
	public void editstaff() {
		System.out.println("***Edit the staff*** : ");
		System.out.println("Name : ");
		String staffname = input.next();
		
		if(staff.name.equals(staff.name))
		{
			int num  = 4;
			while(num !=5 ) {
				
				System.out.println("  -part-timeworke Info edit menu- ");
				System.out.println("   What do you want to do? " );
				System.out.println(" 1. Edit Name ");
				System.out.println(" 2. Edit age ");
				System.out.println(" 3. Edit phonenumber");
				System.out.println(" 4. Edit workhour" );
				System.out.println(" 5. Exit Edit " );  
				System.out.println(" Selcet one number between 1 ~ 5 :" ); 
				
				num = input.nextInt();
				
				
				if(num == 1) {
					System.out.println("Name : ");
					staff.name = input.next();
					
				}
				
				else if(num == 2) {
					System.out.println("age : ");
					staff.age = input.nextInt();
				
				}
				
				else if(num == 3) {
					System.out.println("Phone number : ");
					staff.phonenumber = input.nextInt();
					
				}
				
				else if(num == 4) {
					System.out.println("working hour : ");
					staff.workhour = input.nextInt();
					
				}
				
				else  {
					continue;
				}
				
			}
		}
			
	}
	
	public void viewstaff() {
		System.out.println("***View the staff*** : ");
		System.out.println("Name : ");
		String staffname = input.next();
		if(staff.name.equals(staff.name))
		{
			staff.printinfo();
		}
	}
}

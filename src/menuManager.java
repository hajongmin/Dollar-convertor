


import java.util.Scanner;

public class menuManager {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num  = 5;
		while(num !=6 ) {
			
			System.out.println(" -- part-timeworker Manegement System  -- ");
			System.out.println("   What do you want to do? " );
			System.out.println(" 1. Add Staff ");
			System.out.println(" 2. Delete Staff ");
			System.out.println(" 3. Edit Staff  ");
			System.out.println(" 4. view Staff    " );
			System.out.println(" 5. Show a menu " );
			System.out.println(" 6. Exit the program " );  
			System.out.println(" Selcet one number between 1 ~ 5 :" ); 
			
			num = input.nextInt();
			
			
			if(num == 1) {
				addstaff();
			}
			
			else if(num == 2) {
				deletestaff();
			}
			
			else if(num == 3) {
				editstaff();
			}
			
			else if(num == 4) {
				viewstaff();
			}
			
			else  {
				continue;
			}
		}
			
			

	}
	
	public static void addstaff() {
		Scanner input = new Scanner(System.in);
		System.out.print("Name : ");
		String name = input.nextLine();
		System.out.print("Phone number : ");
		String ph = input.nextLine();
		System.out.print("working hour : ");
		int time = input.nextInt();	
	}
	
	public static void deletestaff() {
		Scanner input = new Scanner(System.in);
		System.out.println("Name : ");
		String name = input.nextLine();
	}
	
	
	public static void editstaff() {
		Scanner input = new Scanner(System.in);
		System.out.println("Name : ");
		String name = input.nextLine();
		
		
	}
	
	public static void viewstaff() {
		Scanner input = new Scanner(System.in);
		System.out.print("Name : ");
		String name = input.nextLine();
		
	}
		
		
}
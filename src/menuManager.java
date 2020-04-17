import java.util.Scanner;

public class menuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StaffManager staffmanager = new StaffManager(input);

		int num = 4;
		while (num != 5) {

			System.out.println(" -- Staff Manegement System  -- ");
			System.out.println("   What do you want to do? ");
			System.out.println(" 1. Add Staff ");
			System.out.println(" 2. Delete Staff ");
			System.out.println(" 3. Edit Staff ");
			System.out.println(" 4. view Staffs ");
			System.out.println(" 5. Exit the program ");
			System.out.println(" Selcet one number between 1 ~ 5 :");

			num = input.nextInt();

			if (num == 1) {
				staffmanager.addstaff();
			}

			else if (num == 2) {
				staffmanager.deletestaff();
			}

			else if (num == 3) {
				staffmanager.editstaff();
			}

			else if (num == 4) {
				staffmanager.viewstaffs();
			}

			else {
				continue;
			}

		}

	}

}

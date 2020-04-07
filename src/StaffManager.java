import java.util.ArrayList;
import java.util.Scanner;

public class StaffManager {
	ArrayList<Staff> staffs = new ArrayList<Staff>();
	Scanner input;

	StaffManager(Scanner input) {
		this.input = input;
	}

	public void addstaff() {
		Staff staff = new Staff();
		System.out.println("***Add the staff*** ");
		System.out.println("Name : ");
		staff.name = input.next();
		System.out.println("age : ");
		staff.age = input.nextInt();
		System.out.println("Phone number : ");
		staff.phonenumber = input.nextInt();
		System.out.println("working hour : ");
		staff.workhour = input.nextInt();
		staffs.add(staff);

	}

	public void deletestaff() {
		System.out.println("***Delete the staff*** : ");
		System.out.println("Name : ");
		String staffname = input.next();
		int index = -1; // 배열에서 인덱스를 못찾았다.

		for (int i = 0; i < staffs.size(); i++) {
			if (staffs.get(i).name.equals(staffname)) {
				index = i;
				break;
			}
		}

		if (index >= 0) {
			staffs.remove(index);
			System.out.println("staff Name" + staffname + "is deleted ");
		}

		else {
			System.out.println("staff Name has not been resisterd");
			return;
		}

	}

	public void editstaff() {
		System.out.println("***Edit the staff*** : ");
		System.out.println("Name : ");
		String staffname = input.next();
		for (int i = 0; i < staffs.size(); i++) {
			Staff staff = staffs.get(i);
			if (staff.name.equals(staffname)) {
				int num = 4;
				while (num != 5) {

					System.out.println("  -part-timeworke Info edit menu- ");
					System.out.println("   What do you want to do? ");
					System.out.println(" 1. Edit Name ");
					System.out.println(" 2. Edit age ");
					System.out.println(" 3. Edit phonenumber");
					System.out.println(" 4. Edit workhour");
					System.out.println(" 5. Exit Edit ");
					System.out.println(" Selcet one number between 1 ~ 5 :");

					num = input.nextInt();

					if (num == 1) {
						System.out.println("Name : ");
						staff.name = input.next();

					}

					else if (num == 2) {
						System.out.println("age : ");
						staff.age = input.nextInt();

					}

					else if (num == 3) {
						System.out.println("Phone number : ");
						staff.phonenumber = input.nextInt();

					}

					else if (num == 4) {
						System.out.println("working hour : ");
						staff.workhour = input.nextInt();

					}

					else {
						continue;
					} // if

				} // while
				break;
			} // if
		} // for

	}

	public void viewstaffs() {
		for (int i = 0; i < staffs.size(); i++) {
			staffs.get(i).printinfo();
		}
	}
}

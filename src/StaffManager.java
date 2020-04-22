import java.util.ArrayList;
import java.util.Scanner;

import Staff.Manager;
import Staff.NonRegularworker;
import Staff.Staff;
import Staff.StaffKind;

public class StaffManager {
	ArrayList<Staff> staffs = new ArrayList<Staff>();
	Scanner input;

	StaffManager(Scanner input) {
		this.input = input;
	}

	public void addstaff() {
		int kind = 0; //addstaff���� ������������ �߰��Ұ����� �������� ������ �߰��Ұ������� �����ϱ� ���� �������� while���� ������ ���ؼ� �����ϴ� ������ 0
		Staff staff;  //staffŬ������ ����ϱ����� ���� �ؿ� ���� staff�� ������ while�� �ȿ������� ������ �߱� ������ �ۿ� ��������
		while (kind !=1 && kind !=2) //�� ������ �߰��Ұ������� �����ϱ� ���� ����
		{
			System.out.println("1 for Regularworker");
			System.out.println("2 for NonRegularworker");
			System.out.println("3 for Manager");
			System.out.println("Select num for Staff Kind");
			kind = input.nextInt();  //kind�� �Է¹޴´� 1or 2
			if (kind == 1)
			{
				staff = new Staff(StaffKind.Regularworker); //���� staff�� regularworker�� �ǹ��ϹǷ� staff�� ���� 
				staff.getUserInput(input);  //staff�� �������� protected�� �����س��ұ� ������ getuserinput�� ���� �Է��� �޴´�.
 				staffs.add(staff); // staff�迭�� �߰��ϰڴ�.
				break;  // w������ ������ ���������Ƿ� while���� ���������� ���� break;
			}

			else if (kind == 2) 
			{
				staff = new NonRegularworker(StaffKind.NonRegularworker); // staff�� ��ӹ��� nonregularworker�� �������� �ʱ�ȭ �ϱ� ���ؼ� ����
				staff.getUserInput(input);
				staffs.add(staff);
				break;  // �������� ������ �����Ͽ����Ƿ� while���� ���������� ���� break;
			}
			
			else if (kind == 3) 
			{
				staff = new Manager(StaffKind.Manager); // staff�� ��ӹ��� nonregularworker�� �������� �ʱ�ȭ �ϱ� ���ؼ� ����
				staff.getUserInput(input);
				staffs.add(staff);
				break;  // �������� ������ �����Ͽ����Ƿ� while���� ���������� ���� break;
			}

			else 
			{
				System.out.println("Select num for Staff Kind 1 or 3"); //������ ������ �����ϴ� if���� ���ڸ� �߸��Է��Ѱ��
			}
		}






	}

	public void deletestaff() {
		System.out.println("***Delete the staff*** : ");
		System.out.println("Name : ");
		String staffname = input.next();
		int index = -1; // �迭���� �ε����� ��ã�Ҵ�.

		for (int i = 0; i < staffs.size(); i++) {
			if (staffs.get(i).getName().equals(staffname)) { // i�� staff�迭�� �ҷ��������� get(i)����߰� �׹迭�� ��ü�̹Ƿ� ��ü���� �Լ��� �������� .getName()�� ��
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
			if (staff.getName().equals(staffname)) { 
				int num = 4;
				while (num != 5) {

					System.out.println("  "
							+ "-part-timeworke Info edit menu- ");
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
						String name = input.next();
						staff.setName(name);
					}

					else if (num == 2) {
						System.out.println("age : ");
						int age = input.nextInt();
						staff.setAge(age); 
					}

					else if (num == 3) {
						System.out.println("Phone number : ");
						int phonenumber = input.nextInt();
						staff.setPhonenumber(phonenumber);
					}

					else if (num == 4) {
						System.out.println("working hour : ");
						int workhour = input.nextInt();
						staff.setWorkhour(workhour);
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
		System.out.println("number of registered staffs : " + staffs.size());
		for (int i = 0; i < staffs.size(); i++) {
			staffs.get(i).printinfo(); 
		}
	}
}

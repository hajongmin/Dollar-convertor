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
		int kind = 0; //addstaff에서 정규직직원을 추가할것인지 비정규직 직원을 추가할것인지를 선택하기 위한 질문으로 while문을 돌리기 위해서 존재하는 변수값 0
		Staff staff;  //staff클래스를 사용하기위한 선언 밑에 보면 staff의 선언이 while문 안에있으면 에러가 뜨기 때문에 밖에 선언해줌
		while (kind !=1 && kind !=2) //직 직원을 추가할것인지를 선택하기 위한 질문
		{
			System.out.println("1 for Regularworker");
			System.out.println("2 for NonRegularworker");
			System.out.println("3 for Manager");
			System.out.println("Select num for Staff Kind");
			kind = input.nextInt();  //kind를 입력받는다 1or 2
			if (kind == 1)
			{
				staff = new Staff(StaffKind.Regularworker); //원래 staff는 regularworker을 의미하므로 staff로 선언 
				staff.getUserInput(input);  //staff의 변수들을 protected로 선언해놓았기 때문에 getuserinput을 통해 입력을 받는다.
 				staffs.add(staff); // staff배열에 추가하겠다.
				break;  // w정규직 직원을 선택했으므로 while문을 빠져나오기 위해 break;
			}

			else if (kind == 2) 
			{
				staff = new NonRegularworker(StaffKind.NonRegularworker); // staff를 상속받은 nonregularworker의 변수들을 초기화 하기 위해서 써줌
				staff.getUserInput(input);
				staffs.add(staff);
				break;  // 비정규직 직원을 선택하였으므로 while문을 빠져나오기 위한 break;
			}
			
			else if (kind == 3) 
			{
				staff = new Manager(StaffKind.Manager); // staff를 상속받은 nonregularworker의 변수들을 초기화 하기 위해서 써줌
				staff.getUserInput(input);
				staffs.add(staff);
				break;  // 비정규직 직원을 선택하였으므로 while문을 빠져나오기 위한 break;
			}

			else 
			{
				System.out.println("Select num for Staff Kind 1 or 3"); //직원의 종류를 선택하는 if문의 숫자를 잘못입력한경우
			}
		}






	}

	public void deletestaff() {
		System.out.println("***Delete the staff*** : ");
		System.out.println("Name : ");
		String staffname = input.next();
		int index = -1; // 배열에서 인덱스를 못찾았다.

		for (int i = 0; i < staffs.size(); i++) {
			if (staffs.get(i).getName().equals(staffname)) { // i번 staff배열을 불러오기위해 get(i)사용했고 그배열은 객체이므로 객체안의 함수를 쓰기위해 .getName()을 씀
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

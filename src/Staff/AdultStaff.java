package Staff;

 

import java.util.Scanner;

 

public abstract class AdultStaff extends Staff { 

 

	public AdultStaff(StaffKind kind) { 

		super(kind);

	}

	

	@Override

	public abstract void getUserInput(Scanner input); 

	

	@Override

	public void printinfo() { 

		String skind = getKindString();

		System.out.print("kind: " + skind +"," + " name : " + name + ", " + "age : " + age + ", " + "phonenumer : " + phonenumber + ", "

				+ "workhour : " + workhour + "\n\n");

	}

 

	public void setStaffagewithYN(Scanner input) { 

		char answer = 'x';  

		while (answer != 'y' && answer !='Y' && answer !='n' && answer !='N')

		{

			System.out.println("Do you want to know age? (Y/N)");

			answer = input.next().charAt(0);

			if(answer == 'y' || answer == 'Y')

			{

				setStaffAge(input); 

				break;

			}

 

			else if (answer == 'N' || answer == 'n')

			{

				this.setAge(0);      // ������ ������ " " �� ������ ǥ������ ���� 0�� ��µǵ��� �Ͽ����ϴ�.

				break;

			}

 

			else {

 

			}

		}

	}

	

}
package Staff;

 

import java.util.Scanner;

 

public class Manager extends AdultStaff  {

	

	public Manager(StaffKind kind) {

		super(kind);

	}

	

	public void getUserInput(Scanner input) {

		System.out.println("***Add the staff*** ");

		setStaffName(input); //�߰�

		setStaffagewithYN(input); //�߰�

		setStaffPhonenumber(input); // �߰�

		setStaffWorkhour(input); // �߰�

	}

	

} //printInfo()��   skind�� ���ϴ� �κ��� ������ ���� skind�� �������ִ� �Լ��� �����־��־���  , getuserinput()�Լ�����  �̸��� �Է¹��� �� ������ ����� ����

    //setStaffName()�� ����Ͽ� �ٲ��־���., �ؿ� while������ �Ȱ��� �κ��� �Լ��� ó��
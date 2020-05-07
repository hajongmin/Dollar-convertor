package Staff;

 

import java.util.Scanner;

 

public class Manager extends AdultStaff  {

	

	public Manager(StaffKind kind) {

		super(kind);

	}

	

	public void getUserInput(Scanner input) {

		System.out.println("***Add the staff*** ");

		setStaffName(input); //추가

		setStaffagewithYN(input); //추가

		setStaffPhonenumber(input); // 추가

		setStaffWorkhour(input); // 추가

	}

	

} //printInfo()의   skind를 정하는 부분을 밖으로 꺼내 skind를 리턴해주는 함수로 만들어넣어주었다  , getuserinput()함수에서  이름을 입력받을 때 이전에 만들어 놓은

    //setStaffName()와 비슷하여 바꿔주었다., 밑에 while문빼고 똑같은 부분을 함수로 처리
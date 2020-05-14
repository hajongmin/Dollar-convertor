package Staff;

import java.util.Scanner;

public class Manager extends AdultStaff  {

	public Manager(StaffKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		System.out.println("***Add the staff*** ");
		setStaffName(input); 
		setStaffagewithYN(input); 
		setStaffPhonenumber(input); 
	}

} 
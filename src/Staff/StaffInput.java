package Staff;

import java.util.Scanner;

import Exception.PhonenumFormatException;

public interface StaffInput {

	public String getName();

	public void setName(String name);

	public void setAge(String age);

	public void setPhonenumber(String phonenumber) throws PhonenumFormatException ;

	public void setWorkhour(int workhour);

	public void printinfo();

	public void getUserInput(Scanner input);

	public void  setStaffName(Scanner input);

	public void  setStaffAge( Scanner input);

	public void  setStaffPhonenumber( Scanner input);

	public void  setStaffWorkhour( Scanner input);
}
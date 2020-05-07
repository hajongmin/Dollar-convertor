package Staff;



import java.util.Scanner;



public interface StaffInput {



	public String getName();



	public void setName(String name);



	public void setAge(int age);



	public void setPhonenumber(int phonenumber);



	public void setWorkhour(int workhour);



	public void printinfo();



	public void getUserInput(Scanner input);



	public void  setStaffName(Scanner input);



	public void  setStaffAge( Scanner input);



	public void  setStaffPhonenumber( Scanner input);



	public void  setStaffWorkhour( Scanner input);

}

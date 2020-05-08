package Staff;

 

import java.util.Scanner;

 

public abstract class Staff implements StaffInput { //staff��� ��ü�� �������� �ʴ´�.

	protected StaffKind kind = StaffKind.Regularworker;

	protected String name;	//protected�� ��ӿ��� �ַ�Ȱ�� �ܺ� Ŭ�������� ���� ���������� �׷��� ��ӹ޴� Ŭ�������� �ֵ��� �ϰ������ 

	protected int age;

	protected int phonenumber;

	protected int workhour; 

	//�ڽĿ��� ��ӵǴµ� �� �� �ܺ� Ŭ�������� ���� ���ϴ�, ���� ��Ű���ȿ��� ���Ե����� �ٸ������� ���� ���ϵ��� �ϴ� ��Ʈ

 

	public Staff() {

 

	}

	

	public Staff(StaffKind kind) {

		this.kind = kind;

 

	}

 

	public Staff(String name, int age, int phonenumber, int workhour) {

		this.name = name;

		this.age = age;

		this.phonenumber = phonenumber;

		this.workhour = workhour;

	}

	

	public Staff(StaffKind kind, String name, int age, int phonenumber, int workhour) {

		this.kind = kind;

		this.name = name;

		this.age = age;

		this.phonenumber = phonenumber;

		this.workhour = workhour;

	}

 

 

	public StaffKind getKind() {

		return kind;

	}

 

	public void setKind(StaffKind kind) {

		this.kind = kind;

	}

 

	public String getName() {

		return name;

	}

 

	public void setName(String name) {

		this.name = name;

	}

 

	public int getAge() {

		return age;

	}

 

	public void setAge(int age) {

		this.age = age;

	}

 

	public int getPhonenumber() {

		return phonenumber;

	}

 

	public void setPhonenumber(int phonenumber) {

		this.phonenumber = phonenumber;

	}

 

	public int getWorkhour() {

		return workhour;

	}

 

	public void setWorkhour(int workhour) {

		this.workhour = workhour;

	}

 

	

	public abstract void printinfo(); 

	

	public void  setStaffName(Scanner input) {

		System.out.println("Name : ");

		String name = input.next();

		this.setName(name);

	}

	

	public void  setStaffAge( Scanner input) {

		System.out.println("age : ");

		int age = input.nextInt();

		this.setAge(age); 

	}

	

	public void  setStaffPhonenumber( Scanner input) {

		System.out.println("Phone number : ");

		int phonenumber = input.nextInt();

		this.setPhonenumber(phonenumber);

	}

	

 

	public void  setStaffWorkhour( Scanner input) {

		System.out.println("working hour : ");

		int workhour = input.nextInt();

		this.setWorkhour(workhour);

	}

	

	public String getKindString() { 

		String skind = "none";

		switch(this.kind) {

		

		case Regularworker:

			skind = "Regular";

			break;

		

		case NonRegularworker:

			skind = "NonRegular";

			break;

		

		case Manager:

			skind = "Manager";

			break;

			

		default:	

		}

		return skind;

	}

	

 

} 
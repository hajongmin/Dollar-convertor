
public class Staff {
	String name;
	int age;
	int phonenumber;
	int workhour;
	
	public Staff()
	{
		
	}
	
	
	public Staff(String name, int age, int phonenumber, int workhour)
	{
		this.name = name;
		this.age = age;
		this.phonenumber = phonenumber;
		this.workhour = workhour;
	}
	
	public void printinfo()
	{
		System.out.print("name : " + name +"\n"+ "age : " + age +"\n"+ "phonenumer : " + phonenumber+"\n" + "workhour : " + workhour+"\n");
	}
}

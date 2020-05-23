package Staff;
import java.io.Serializable;
import java.util.Scanner;
import Exception.PhonenumFormatException;
public abstract class Staff implements StaffInput, Serializable  { //추가
 /**
  * 
  */
 private static final long serialVersionUID = 1510186297224912856L;
 protected StaffKind kind = StaffKind.Regularworker;
 protected String name; 
 protected String age;
 protected String phonenumber; 
 protected int workhour; 
 
 public Staff() {
 }
 
 public Staff(StaffKind kind) {
  this.kind = kind;
 }
 public Staff(String name, String age, String phonenumber, int workhour) {
  this.name = name;
  this.age = age;
  this.phonenumber = phonenumber;
  this.workhour = workhour;
 }
 
 public Staff(StaffKind kind, String name, String age, String phonenumber, int workhour) {
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
 public String getAge() {
  return age;
 }
 public void setAge(String age) {
  this.age = age;
 }
 public String getPhonenumber() {
  return phonenumber;
 }
 public void setPhonenumber(String phonenumber) throws PhonenumFormatException  { //추가
  if(!phonenumber.contains("-")) {
   throw new PhonenumFormatException();
  }
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
  String age = input.next();
  this.setAge(age); 
 }
 
 public void  setStaffPhonenumber( Scanner input) {
  String phonenumber = "";
  while (!phonenumber.contains("-")) {
   System.out.println("Phone number : ");
   phonenumber = input.next();
   try {
    this.setPhonenumber(phonenumber);
   } 
   catch (PhonenumFormatException e) {
    System.out.println("Incorrect Phonenum Format. put the phonenum that contains '-'");
   }
  }
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
 
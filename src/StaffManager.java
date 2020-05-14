import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Staff.Manager;
import Staff.NonRegularworker;

import Staff.Regularworker;
import Staff.Staff;
import Staff.StaffInput;
import Staff.StaffKind;

public class StaffManager {
 ArrayList<StaffInput> staffs = new ArrayList<StaffInput>();
 Scanner input;

 StaffManager(Scanner input) {
  this.input = input;
 }

 public void addstaff() {
  int kind = 0;
  StaffInput staffInput;
  while (kind < 1 || kind> 3) //추가
  {
   try { //추가
    System.out.println("1 for Regularworker");
    System.out.println("2 for NonRegularworker");
    System.out.println("3 for Manager");
    System.out.println("Select num for Staff Kind");
    kind = input.nextInt(); 
    if (kind == 1)
    {
     staffInput = new Regularworker(StaffKind.Regularworker);
     staffInput.getUserInput(input); 
     staffs.add(staffInput);
     break; 
    }

    else if (kind == 2)
    {
     staffInput = new NonRegularworker(StaffKind.NonRegularworker);
     staffInput.getUserInput(input);
     staffs.add(staffInput);
     break; 
    }

    else if (kind == 3)
    {
     staffInput = new Manager(StaffKind.Manager);
     staffInput.getUserInput(input);
     staffs.add(staffInput);
     break; 
    }

    else
    {
     System.out.println("Select num for Staff Kind 1 or 3");
    }
   }
   catch(InputMismatchException e) { // 추가
    System.out.println("Please put an integer between 1 and 3!");
    
    if(input.hasNext()) {
     input.next();
    }
    kind = -1;
   }
  }

 }

 public void deletestaff() {
  System.out.println("***Delete the staff*** : ");
  System.out.println("Name : ");
  String staffname = input.next();
  
  int index = findIndex(staffname);
  removefromStaffs(index, staffname);

 }
 
 public int findIndex(String staffname) { //어레이에서 입력받은 name의 index값을 찾는 함수.
  int index = -1;
  for (int i = 0; i < staffs.size(); i++) {
   if (staffs.get(i).getName().equals(staffname)) {
    index = i;
    break;
   }
  }
  return index;
 }
 
 public int removefromStaffs(int index, String staffname ) {
  if (index >= 0) {
   staffs.remove(index);
   System.out.println("staff Name" + staffname + "is deleted ");
   return 1;
  }

  else {
   System.out.println("staff Name has not been resisterd");
   return -1;
  }
 }
 //delete 함수
 

 public void editstaff() {
  System.out.println("***Edit the staff*** : ");
  System.out.println("Name : ");
  String staffname = input.next();
  for (int i = 0; i < staffs.size(); i++) {
   StaffInput staff = staffs.get(i);
   if (staff.getName().equals(staffname)) {
    int num = 4;
    while (num != 5) {
     showEditMenu();
     num = input.nextInt();
     try { //
     switch(num) { // staffInput에 시그니처를 추가함으로 서 staff를 상속받는 manager nonreg,regul등이 인터페이스를 할 필요가 없어짐.
     case 1 :
      staff.setStaffName(input);
      break;
     case 2 :
      staff.setStaffAge(input);
      break;
     case 3 :
      staff.setStaffPhonenumber(input);
      break;
     case 4 :
      staff.setStaffWorkhour(input);
      break;
      
      
     default :
      continue;
     }
     }catch(InputMismatchException e) { //추가 잘못된 값을 입력시 다시 메뉴가 뜨도록하는 코드
      System.out.println("Please put an integer between 1 and 5!");
      
      if(input.hasNext()) {
       input.next();
      }
      num = -1;
     }
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
 
 
 //class내 함수
 
 
 public void showEditMenu() {
  System.out.println(" -part-timeworke Info edit menu- ");
  System.out.println("   What do you want to do? ");
  System.out.println(" 1. Edit Name ");
  System.out.println(" 2. Edit age ");
  System.out.println(" 3. Edit phonenumber");
  System.out.println(" 4. Edit workhour");
  System.out.println(" 5. Exit Edit ");
  System.out.println(" Selcet one number between 1 ~ 5 :");
 }
}    
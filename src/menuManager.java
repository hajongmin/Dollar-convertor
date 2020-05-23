import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;
public class menuManager {
 static EventLogger logger = new EventLogger("log.txt"); //추가
 public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  StaffManager staffmanager = getObject("staffmanager.ser");
  if(staffmanager == null) {
   staffmanager = new StaffManager(input);
  }
  else {
   staffmanager.setScanner(input);
  }
   
  
  selectMenu(input, staffmanager);
  putObject(staffmanager, "staffmanager.ser");
 }
 
 public static void selectMenu(Scanner input, StaffManager staffmanager) {
  int num = -1;          
  while (num != 5) {
   try { 
    showMenu();
    num = input.nextInt();
    switch(num) {
    case 1 :
     staffmanager.addstaff();
     logger.log("add staff");//추가
     break;
    case 2 :
     staffmanager.deletestaff();
     logger.log("delete staff");//추가
     break;   
    case 3 :
     staffmanager.editstaff();
     logger.log("edit staff");//추가
     break;   
    case 4 :
     staffmanager.viewstaffs();
     logger.log("view staff");//추가
     break;
    default :
     continue;
    } 
   }
   catch(InputMismatchException e) { 
    System.out.println("Please put an integer between 1 and 5!");
    
    if(input.hasNext()) {
     input.next();
    }
    num = -1;
   }
  }
 }
 
 
 public static void showMenu() {
  System.out.println(" -- Staff Manegement System  -- ");
  System.out.println("   What do you want to do? ");
  System.out.println(" 1. Add Staff ");
  System.out.println(" 2. Delete Staff ");
  System.out.println(" 3. Edit Staff ");
  System.out.println(" 4. view Staffs ");
  System.out.println(" 5. Exit the program ");
  System.out.println(" Selcet one number between 1 ~ 5 :");
  
 }
 public static StaffManager getObject(String filename) { //추가
  StaffManager staffmanager = null;
  
  try {
   FileInputStream file = new FileInputStream(filename);
   ObjectInputStream in = new ObjectInputStream(file);
   
   staffmanager = (StaffManager) in.readObject();
   in.close();
   file.close();
  } 
  
  catch (FileNotFoundException e1) {
   return staffmanager;
  }
  catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } 
  catch (ClassNotFoundException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  
  return staffmanager;
  
 }
 
 public static void putObject(StaffManager staffmanager, String filename) { //추가
  
  try {
   FileOutputStream file = new FileOutputStream(filename);
   ObjectOutputStream out = new ObjectOutputStream(file);
   
   out.writeObject(staffmanager);
   
   out.close();
   file.close();
  } 
  
  catch (FileNotFoundException e1) {
   // TODO Auto-generated catch block
   e1.printStackTrace();
  }
  catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  
 }
}  
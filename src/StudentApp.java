import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * 
 * @StudentApp
 */
public class StudentApp {

	public static void main(String[] args) throws IOException {
		 Student student;
		  
		 String stName;
		 String stAddress;
		 String stID;
		 String stMajor;
		 String stGpa;
		 int count =1;
		 System.out.println("Sr.#\tSID\tName\tAddress\tMarjor\tGPA");
		 while(count<=4) {
		 stName = JOptionPane.showInputDialog(null,count+": "+"Enter Student Name");
		 stAddress= JOptionPane.showInputDialog(null,count+": "+"Enter Student address");
		 stID = JOptionPane.showInputDialog(null,count+": "+"Enter Student ID");
		 stMajor = JOptionPane.showInputDialog(null,count+": "+"Enter Student Major");
		 stGpa = JOptionPane.showInputDialog(null,count+": "+"Enter Student GPA");
		 int sid=Integer.parseInt(stID);
		 double sGpa = Double.parseDouble(stGpa);
		 
		 while(sid < 10001 || sid > 99999 && sGpa < 2.0 || sGpa>4.0){
			 JOptionPane.showConfirmDialog(null, "Please check and Enter valid  ID and GPa");
			 stID = JOptionPane.showInputDialog(null,count+": "+"Enter Student ID");
			 stGpa = JOptionPane.showInputDialog(null,count+": "+"Enter Student GPA");
			 sid=Integer.parseInt(stID);
			 sGpa = Double.parseDouble(stGpa);
		 }
		 
		 student =new  Student(sid,stMajor,sGpa,stName,stAddress);
			 FileWriter fw = new FileWriter("StudentInformation.txt",true);// fw object will not delete the old entry appending
			 PrintWriter outfile = new PrintWriter(fw);
			 outfile.println(count+":\t"+sid+"\t"+stName+"\t"+stAddress+"\t"+stMajor+"\t"+sGpa);
			 outfile.close();
			 fw.close();
			 count++;
		 }
		 ReadData();
		 
		 int number=0;
		 String choiceNumber ;
		 try {
		 choiceNumber = JOptionPane.showInputDialog(null,"Enter number for Recusive Method");
		  number = Integer.parseInt(choiceNumber);
		 }catch(Exception s) {
			 JOptionPane.showMessageDialog(null, "Please Enter valid number, try again");
		 }
		 
		 RecusiveMethod(number);
		 
		 
		 

	}
	 
	public static void ReadData() throws IOException {
	
		String FileName="StudentInformation.txt";
		
		File openMyFile = new File(FileName);
		Scanner inputFile = new Scanner(openMyFile);
		
		while(inputFile.hasNext()) {
			System.out.println(inputFile.nextLine());
		}
		inputFile.close();
	}
	 
	
	public static void RecusiveMethod(int n) {
		 if(n==0) {
			 System.out.println(" ");
		 }else {
			 int y = n-1 ;
			 RecusiveMethod(y);
			 if(n%2==0) {
				 System.out.print(n+" ");
			 }
		 }
		 
	}

}


/*
 * 
 * 
 * @ student class
 */
public class Student {

	int id;
	PersonalDetails person;
	String major;
	double gpa;
	
	Student(){
		
	}
	
	Student(int id,String major,double gpa, String name,String address){
		this.id = id;
		this.major=major;
		this.gpa = gpa;
		person = new PersonalDetails( name, address);
	}
	
	
	public int getId() {
		return id;
	}
	
	public String getMajor() {
		return major;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	
	
	
}

package classpart;

public class Student {

	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student() {}
	
	public Student(int id, String name) {
		studentID = id;
		studentName	= name;
	}	
	
	public void showStudentInfor() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	/*
	public static void main(String[] args) {
		
		
		Student studentLee	= new Student();		
		studentLee.studentName = "Lee";
		studentLee.studentID = 100;
		studentLee.address = "Seoul";
		
		Student studentKim	= new Student();		
		studentKim.studentName = "Kim";
		studentKim.studentID = 101;
		studentKim.address = "Daegu";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		
	}
	*/
}

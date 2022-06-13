package classpart;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100,"seoul");
		//studentLee.studentName = "leesnssin";
		//studentLee.studentID = 100;
		studentLee.address	= "seoul gangnamgu";
		
		Student studentKim = new Student();
		studentKim.studentName = "kimyusin";
		studentKim.studentID = 101;
		studentKim.address = "Daegu bukgu";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
		
		
	}

}

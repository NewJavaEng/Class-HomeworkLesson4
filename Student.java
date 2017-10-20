package by.http.lesson4;

//if there are several constructors in your Class, it means that they are overloaded

public class Student {
	
	String department;
	String subject;
	String appearance;
	int averageMark;
	
	public Student(){
		appearance = "smart";
		averageMark = 8;
		System.out.println("1st Constructor is used");
		System.out.println("Student is " + appearance);
		System.out.println("Average Mark is " + averageMark);
	}
	
	public Student(String studentDepartment, String studentSubject){
		department = studentDepartment;
		subject = studentSubject;
		System.out.println("2nd Constructor is used");
		System.out.println("Student Department is " + department);
		System.out.println("Student Subject is " + subject);
	}
	
	public Student(String studentDepartment, int studnentAverageMark){
		department = studentDepartment;
		averageMark = studnentAverageMark;
		System.out.println("3rd Constructor is used");
		System.out.println("Student Department is " + department);
		System.out.println("Average Mark is " + averageMark);
	}
	
	public Student(int studnentAverageMark, String studentDepartment){
		department = studentDepartment;
		averageMark = studnentAverageMark;
		System.out.println("4th Constructor is used");
		System.out.println("Student Department is " + department);
		System.out.println("Average Mark is " + averageMark);
	}
	
	public Student(String studentDepartment, int studnentAverageMark, String studentAppearance){
		department = studentDepartment;
		averageMark = studnentAverageMark;
		appearance = studentAppearance;
		System.out.println("5th Constructor is used");
		System.out.println("Student Department is " + department);
		System.out.println("Average Mark is " + averageMark);
		System.out.println("Student is " + appearance);
	}

}

package by.http.lesson4;

//six students are created using 5 constructors

public class MainStudent {

	public static void main(String[] args) {
		
		Student studentOne;
		studentOne = new Student("Department AAA", "Philosophy");
		System.out.println();

		Student studentTwo = new Student();
		System.out.println();
		
		Student studentThree = new Student(4, "Department BBB");
		System.out.println();
		
		Student studentFour = new Student("Department CCC", 7);
		System.out.println();
		
		Student studentFive = new Student("Department CCC", 6, "very very very nice");
		System.out.println();
		
		Student studentSix = new Student();
		System.out.println();

	}

}

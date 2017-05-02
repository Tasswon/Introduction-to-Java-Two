/**Name: Joseph Tassone
 * Description: Tests out the course class
 */


import java.util.Scanner;

public class CourseTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Creates a new course
		System.out.print("Enter a course: ");
		String x1 = input.nextLine();
		Course java = new Course(x1);
		
		System.out.print("Enter three students: ");
		
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		String s3 = input.nextLine();
		
		//Allows user to add three students 
		java.addStudent(s1);
		java.addStudent(s2);
		java.addStudent(s3);
		
		System.out.print("Enter a student to remove: ");
		String s = input.nextLine();
		
		//Drops a student from the course
		java.dropStudent(s);
		
		//Prints out the students
		for(int i = 0; i < java.getNumberOfStudents(); i++) {
			System.out.print(java.getStudents()[i] + " ");
			
		}
		
	}
}

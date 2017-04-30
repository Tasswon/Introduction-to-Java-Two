/**Name: Joseph Tassone
 * Course Code: COSC1047
 * Date: June 1, 2016
 * Description: Tests out the course class
 */

import java.util.Scanner;

public class CourseBTest {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		//Creates a new course
		System.out.print("Enter a course: ");
		String x1 = input.nextLine();
		CourseB x = new CourseB("Java");
		
		//Allows user to enter three students
		System.out.print("Enter three students: ");
		
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		String s3 = input.nextLine();
		
		x.addStudent(s1);
		x.addStudent(s2);
		x.addStudent(s3);
		
		System.out.println(x.getStudents());
		
		//Removes selected student
		System.out.print("Enter a student to remove: ");
		String s = input.nextLine();
		x.dropStudent(s);
		
		System.out.println(x.getStudents());
		
		//Clears the arraylist
		x.clear();
		
		System.out.println(x.getStudents());
	}
}

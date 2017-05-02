/**Name: Joseph Tassone
 * Description: Creates a course class which will the user will use to enter information in the test class
 */

import java.util.Scanner;
import java.util.ArrayList;

public class CourseB {
	
	private String courseName;
	private ArrayList<String> students = new ArrayList<>();
	private int numberOfStudents;

	public CourseB(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students.add(student);
		numberOfStudents++;
	}

	public ArrayList<String> getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
		students.remove(student);
	}
	
	public void clear() {
		students.clear();
	}
}


/**Name: Joseph Tassone
 * Course Code: COSC1047
 * Date: June 1, 2016
 * Description: Creates a course class which the user will use to enter information in the test class
 */

public class Course {
	
	private String courseName;
	private String[] students = new String[2];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		
		students[numberOfStudents] = student;
		numberOfStudents++;
		
		if (numberOfStudents >= students.length) {
			String[] temp = new String[numberOfStudents];
			for (int i = 0; i < numberOfStudents; i++) {
				temp[i] = students[i];
			}
			students = new String [numberOfStudents + 1];
			for (int i = 0; i < numberOfStudents; i++) {
				students[i] = temp[i];
			}
		}
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
		 for (int i = 0; i < numberOfStudents; i++)
	            if (students[i].equals(student)) {
	                while (i < numberOfStudents) {
	                    students[i] = students[i+1];
	                    i++;
	                }
	                numberOfStudents--;
	            }
	}
	
	public void clear() {
		for(int i = 0; i < numberOfStudents; i++) {
			students[i] = null;
		}
		numberOfStudents = 0; 
		
	}
}

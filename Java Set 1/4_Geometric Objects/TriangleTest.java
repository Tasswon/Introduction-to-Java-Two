/**Name: Joseph Tassone
 * Course Code: COSC1047
 * Date: June 1, 2016
 * Description: Test the triangle class
 */

import java.util.Scanner;

public class TriangleTest {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three sides of a triangle: ");
		
		//Allows user to enter desired size of sides
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		
		//Creates a new triangle using the user's sides
		Triangle t1 = new Triangle(s1, s2, s3);
		
		System.out.println("Enter a color: ");
		
		//Allows user to enter colour
		String colour = input.next();
		t1.setColor(colour);
		
		System.out.println("Is the triangle filled (yes or no): ");
		
		//Allows user to change if it's filled
		String filled = input.next();
		
		if (filled.equals("yes")) {
			t1.setFilled(true);
		}
		else {
			t1.setFilled(false);
		}
		
		//Returns the information based on what was entered above
		System.out.println("The color is " + t1.getColor());
		System.out.println("The triangle is filled: " + t1.isFilled());
		System.out.println("The permimeter is " + t1.getPerimeter());
		System.out.println("The area is " + t1.getArea());
	}
}

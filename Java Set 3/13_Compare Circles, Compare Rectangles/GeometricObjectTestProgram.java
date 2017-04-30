/**Name: Joseph Tassone
 * Course: COSC1047	
 * Date: June 9, 2016
 * Description: 
 */

import java.util.Scanner;

public class GeometricObjectTestProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the dimensions of rectangle one: ");
		double widthOne = input.nextDouble();
		double heightOne = input.nextDouble();
		
		GeometricObjectTwo r1 = new Rectangle(widthOne, heightOne);
		
		System.out.print("Please enter the dimensions of rectangle two: ");
		double widthTwo = input.nextDouble();
		double heightTwo = input.nextDouble();
		
		GeometricObjectTwo r2 = new Rectangle(widthTwo, heightTwo);
		
		System.out.print("Please enter the radius of circle one: ");
		double radiusOne = input.nextDouble();
		
		GeometricObjectTwo c1 = new Circle(radiusOne);
		
		System.out.print("Please enter the radius of circle Two: ");
		double radiusTwo = input.nextDouble();
		
		GeometricObjectTwo c2 = new Circle(radiusTwo);
		
		System.out.println("\n" + r1.compareTo(r2));
		System.out.println("The max is the rectangle with " + r1.max(r1, r2) + "\n");
		
		System.out.println(c1.compareTo(c2));
		System.out.println("The max is the circle with" + c1.max(c1, c2));
	}
}

/**Name: Joseph Tassone
 * Course: COSC1047	
 * Date: June 7, 2016
 * Description: 
 */

public class TestOctagon {
	public static void main(String[]args) throws CloneNotSupportedException {
		
        Octagon octagon1 = new Octagon(5);
        Octagon octagon2 = (Octagon)octagon1.clone(); 
        
        System.out.printf("The area of ocatagon 1 is %.2f", octagon1.getArea());
        System.out.println("\nThe perimeter of ocatagon 1 is " + octagon1.getPerimeter());
        
        System.out.println("Compare: " + (octagon1.compareTo(octagon2) == 0));
    }
}
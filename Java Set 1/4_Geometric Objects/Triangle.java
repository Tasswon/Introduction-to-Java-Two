/**Name: Joseph Tassone
 * Description: Creates a triangle class that extends the geometric object class
 */

//Sets the default sides of a triangle
public class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }
    
    //Allows user to change size of triangle sides
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    //Getters return the size of the below sides
    public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	//Uses sides to calculate and return the area
	public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
	
	//Uses sides to calculate and return the perimeter
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
    return " Triangle: Side 1 = " + side1 + " Side 2 = " + side2
           + " Side 3 = " + side3;
    }
}


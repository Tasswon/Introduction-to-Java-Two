/**Name: Joseph Tassone
 * Course: COSC1047
 * Date: June 9, 2016
 * Description: 
 */

public class Octagon extends GeometricObject
	implements Cloneable, Comparable <Octagon> {
	
	private double side;
	
	public Octagon() {
		this(1.0);
	}
	
	public Octagon(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public String toString() {
        return "The length of the sides are: " + side;
    }
	
	@Override
	public double getPerimeter() {
		return (8 * side);
	}
	
	@Override
	public double getArea() {
		return (2 + (4 / Math.sqrt(2))) * side * side;
	}
	
	public Object clone() throws CloneNotSupportedException {
			return(Octagon) super.clone();
	}
	
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea() && getPerimeter() > o.getArea()) {
			return 1;
		}
		else if (getArea() < o.getArea() && getPerimeter() > o.getArea()) {
			return -1;
		}
		else {
			return 0;
		}
	}
}

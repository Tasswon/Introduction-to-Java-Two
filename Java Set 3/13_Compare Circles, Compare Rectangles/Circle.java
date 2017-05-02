/**Name: Joseph Tassone
 * Description: Allows one to create a circle object, and extends modified GeometricObjectTwo class
 */

public class Circle extends GeometricObjectTwo{
	
	private double radius;

	public Circle() {
		this(1.0);
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	/**Return radius */
	public double getRadius() {
		return radius;
	}
	
	/**Set a new radius */
	public void setRadius(double radius) {
	}

	@Override /**Return area */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override /**Return perimeter */
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	public String toString() {
        return " " + radius + " are with " + getArea();
    }

	@Override
    public int compareTo(Object o) {
        if (getArea() > ((Circle) o).getArea()) {
            return 1;
        } else if (getArea() < ((Circle) o).getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}
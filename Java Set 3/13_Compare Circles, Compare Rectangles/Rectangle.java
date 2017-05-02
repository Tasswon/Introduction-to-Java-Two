/**Name: Joseph Tassone
 * Description: Allows one to create a rectangle object, and extends modified GeometricObjectTwo class
 */

public class Rectangle extends GeometricObjectTwo {
	
	private double width;
	private double height;
	
	public Rectangle() {
		this(1.0, 1.0);
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String toString() {
        return height + " and " + width + " and " + getArea();
    }
	
	@Override
	public double getPerimeter() {
		return (2 * (width + height));
	}
	
	@Override
	public double getArea() {
		return (width * height);
	}
	
	@Override
    public int compareTo(Object o) {
        if (getArea() > ((Rectangle) o).getArea()) {
            return 1;
        } else if (getArea() < ((Rectangle) o).getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}
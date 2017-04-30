/**Name: Joseph Tassone
 * Course: COSC1047	
 * Date: June 9, 2016
 * Description: Modifies geometric object class to contain comparable and max methods
 */

public abstract class GeometricObjectTwo 
	implements Comparable<Object>{
	
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	/** Construct a default geometric object */
	protected GeometricObjectTwo() {
		dateCreated = new java.util.Date();
	}

	/** Construct a geometric object with color and filled value */
	protected GeometricObjectTwo(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	/** Return color */
	public String getColor() {
		return color;
	}

	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}

	/** Return filled. Since filled is boolean,
	 * the get method is named isFilled */
	public boolean isFilled() {
		return filled;
	}
	
	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Get dateCreated */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color +
				" and filled: " + filled;
	}
	
	/** Abstract method getPerimeter */
	public abstract double getPerimeter();
	
	/** Abstract method getArea */
	public abstract double getArea();
	
	public int compareTo(GeometricObjectTwo o) {
		if (getArea() > o.getArea()) {
			return 1;
		}
		else if (getArea() < o.getArea()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	public static GeometricObjectTwo max (GeometricObjectTwo o, GeometricObjectTwo o2 ) {
		if(o.compareTo(o2) > 0) {
			return o;
       }
       else {
            return o2;
       }
	}
}
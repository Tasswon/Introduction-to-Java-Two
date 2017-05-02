/**Name: Joseph Tassone
 * Description: Creates a geometric object class
 */

public class GeometricObject {
	
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	//Creates a default geometric object
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	//Allows user to change variables for the original default
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	//Getter to return color
	public String getColor() {
		return color;
	}
	
	//Setter to change color
	public void setColor(String color) {
		this.color = color;
	}
	
	////Getter to return whether it's filled
	public boolean isFilled() {
		return filled;
	}
	
	//Setter to change if it's filled
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	//Returns the current for when it was created
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color +
				" and filled: " + filled;
	}
}


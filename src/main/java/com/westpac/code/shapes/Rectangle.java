/**
 * 
 */
package main.java.com.westpac.code.shapes;

import main.java.com.westpac.code.visitors.Visitor;

/**
 * This class represents Rectangle shape.
 * 
 * @author gaurangpathare
 */
public class Rectangle implements Shape {

	public static final String RECTANGLE = "Rectangle";
	private double length;
	private double breath;

	public Rectangle(double length, double breath) {
		this.length = length;
		this.breath = breath;
	}

	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public String getName() {
		return RECTANGLE;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreath() {
		return breath;
	}

	public void setBreath(double breath) {
		this.breath = breath;
	}
	
	@Override
	public String toString() {
		return String.format("%s (length=%s, breadth=%s)", getName(), getLength(), getBreath());
	}
}

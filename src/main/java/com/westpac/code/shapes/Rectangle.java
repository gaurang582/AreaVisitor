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
public class Rectangle extends AbstractShape{

	public static final String RECTANGLE = "Rectangle";
	private double length;
	private double breath;
	
	public Rectangle(double length, double breath) {
		this.length = length;
		this.breath = breath;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
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

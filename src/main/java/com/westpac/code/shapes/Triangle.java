/**
 * 
 */
package main.java.com.westpac.code.shapes;

import main.java.com.westpac.code.visitors.Visitor;

/**
 * This class represents Circle shape.
 * @author gaurangpathare
 */
public class Triangle implements Shape{

	public static final String TRIANGLE = "Triangle";
	private double height;
	private double base;

	public Triangle(double height, double base) {
		this.height = height;
		this.base = base;
	}

	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public String getName() {
		return TRIANGLE;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	@Override
	public String toString() {
		return String.format("%s (base=%s, height=%s)", getName(), getBase(), getHeight());
	}
}

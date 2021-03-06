/**
 * 
 */
package main.java.com.westpac.code.shapes;

import main.java.com.westpac.code.visitors.Visitor;

/**
 * This class represents Circle shape.
 * 
 * @author gaurangpathare
 */
public class Circle extends AbstractShape {

	public static final String CIRCLE = "Circle";
	private double radius;
	private final double pi = Math.PI;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String getName() {
		return CIRCLE;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getPi() {
		return pi;
	}

	@Override
	public String toString() {
		return String.format("%s (radius=%s)", getName(), getRadius());
	}
}

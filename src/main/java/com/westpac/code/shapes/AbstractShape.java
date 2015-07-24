package main.java.com.westpac.code.shapes;

import main.java.com.westpac.code.visitors.Visitor;

/**
 * 
 * <p>This absract class is base case class for all {@link Shape} concrete implementation</p>
 * <p>It binds all shapes to return name and area.</p>
 * @author gaurangpathare
 *
 */
public abstract class AbstractShape implements Shape {

	private double area;

	@Override
	public abstract void accept(Visitor visitor);
	
	@Override
	public abstract String getName();

	@Override
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
}

package main.java.com.westpac.code.visitors;

import main.java.com.westpac.code.shapes.Circle;
import main.java.com.westpac.code.shapes.Rectangle;
import main.java.com.westpac.code.shapes.Triangle;

/**
 * 
 * This class provides methods to calculate area for following shapes {@link Circle}, {@link Rectangle} and {@link Triangle}.
 * 
 * @author gaurangpathare
 * 
 */
public class AreaVisitor implements Visitor {

	@Override
	public double visit(Circle circle) {
		double area = 0;
		if(circle!= null && circle.getRadius() > 0){
			double radiusSq = circle.getRadius() * circle.getRadius();
			area = radiusSq * circle.getPi();
		}
		return area;
	}

	@Override
	public double visit(Rectangle rectangle) {
		double area = 0;
		if(rectangle != null && rectangle.getBreath() > 0 && rectangle.getLength() > 0){
			area = rectangle.getBreath() * rectangle.getLength();
		}
		return area;
	}
	
	@Override
	public double visit(Triangle triangle) {
		double area = 0;
		if(triangle != null && triangle.getBase() > 0 && triangle.getHeight() > 0){
			area = (triangle.getBase() * triangle.getHeight()) / 2;
		}
		return area;
	}
}

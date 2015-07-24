package main.java.com.westpac.code.visitors;

import main.java.com.westpac.code.shapes.Circle;
import main.java.com.westpac.code.shapes.Rectangle;
import main.java.com.westpac.code.shapes.Triangle;

/**
 * 
 * <p>This class provides methods to calculate area for following shapes {@link Circle}, {@link Rectangle} and {@link Triangle}.</p>
 * @author gaurangpathare
 * 
 */
public class AreaVisitor implements Visitor {

	/**
	 * <p>This method calculates and sets area of the shape</p>
	 * 
	 * <p>If the object is null or input is negative value area is set to 0</p>
	 * 
	 * @param circle valid circle object
	 */
	@Override
	public void visit(Circle circle) {
		double area = 0;
		if(circle!= null && circle.getRadius() > 0){
			double radiusSq = circle.getRadius() * circle.getRadius();
			area = radiusSq * circle.getPi();
			circle.setArea(area);
		}
	}

	/**
	 * <p>This method calculates and sets area of the shape</p>
	 * 
	 * <p>If the object is null or input is negative value area is set to 0</p>
	 * 
	 * @param rectangle valid rectangle object
	 */
	@Override
	public void visit(Rectangle rectangle) {
		double area = 0;
		if(rectangle != null && rectangle.getBreath() > 0 && rectangle.getLength() > 0){
			area = rectangle.getBreath() * rectangle.getLength();
			rectangle.setArea(area);
		}
	}
	
	/**
	 * <p>This method calculates and sets area of the shape</p>
	 * 
	 * <p>If the object is null or input is negative value area is set to 0</p>
	 * 
	 * @param triangle valid triangle object
	 */
	@Override
	public void visit(Triangle triangle) {
		double area = 0;
		if(triangle != null && triangle.getBase() > 0 && triangle.getHeight() > 0){
			area = (triangle.getBase() * triangle.getHeight()) / 2;
			triangle.setArea(area);
		}
	}
}

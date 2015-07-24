package main.java.com.westpac.code.visitors;

import main.java.com.westpac.code.shapes.Circle;
import main.java.com.westpac.code.shapes.Rectangle;
import main.java.com.westpac.code.shapes.Triangle;

/**
 * This interface defined contract for Visitor class to calculate area of supported shapes.
 * 
 * @author gaurangpathare
 */
public interface Visitor {

	/**
	 * This method returns area for class {@link Circle}
	 *
	 * @param circle valid circle object
	 * @return area of circle and 0 is the object is null or radius is not a positive value.
	 */
	double visit(Circle circle);

	
	/**
	 * This method returns area for class {@link Rectangle}
	 * @param rectangle valid rectangle object
	 * @return area of rectangle and 0 is the object is null or length or breadth is not a positive value.
	 */
	double visit(Rectangle rectangle);

	/**
	 * This method returns area for class {@link Triangle}
	 * 
	 * @param triangle valid triangle object
	 * @return area of triangle and 0 is the object is null or base or height is not a positive value.
	 */
	double visit(Triangle triangle);
}

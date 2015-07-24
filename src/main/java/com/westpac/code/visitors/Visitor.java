package main.java.com.westpac.code.visitors;

import main.java.com.westpac.code.shapes.Circle;
import main.java.com.westpac.code.shapes.Rectangle;
import main.java.com.westpac.code.shapes.Shape;
import main.java.com.westpac.code.shapes.Triangle;

/**
 * This interface defined contract for Visitor class to visit supported {@link Shape} classes.
 * 
 * @author gaurangpathare
 */
public interface Visitor {

	/**
	 * This method visits class {@link Circle}
	 * @param circle valid circle object
	 */
	void visit(Circle circle);

	
	/**
	 * This method visits class {@link Rectangle}
	 * @param rectangle valid rectangle object
	 */
	void visit(Rectangle rectangle);

	/**
	 * This method visits class {@link Triangle}
	 * @param triangle valid triangle object
	 */
	void visit(Triangle triangle);
}

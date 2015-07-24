/**
 * 
 */
package main.java.com.westpac.code.shapes;

import main.java.com.westpac.code.visitors.Visitor;

/**
 * This interface defines contract for all shape object.
 * @author gaurangpathare
 */
public interface Shape {
	
	/**
	 * @param visitor visitor class 
	 */
	void accept(Visitor visitor);
	
	/**
	 * @return the type of the shape.
	 */
	String getName();

	/**
	 * @return area of shape
	 */
	double getArea();
}

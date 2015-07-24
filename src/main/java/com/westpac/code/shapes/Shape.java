/**
 * 
 */
package main.java.com.westpac.code.shapes;

import main.java.com.westpac.code.visitors.AreaVisitor;

/**
 * This interface defines contract for all shape object.
 * @author gaurangpathare
 */
public interface Shape {
	
	/**
	 * @param areaVisitor visitor class 
	 * @return area of the shape
	 */
	double accept(AreaVisitor areaVisitor);
	
	/**
	 * @return the type of the shape.
	 */
	String getName();
}

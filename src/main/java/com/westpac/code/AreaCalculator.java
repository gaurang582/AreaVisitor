package main.java.com.westpac.code;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import main.java.com.westpac.code.shapes.Circle;
import main.java.com.westpac.code.shapes.Rectangle;
import main.java.com.westpac.code.shapes.Shape;
import main.java.com.westpac.code.shapes.Triangle;
import main.java.com.westpac.code.visitors.Visitor;
import main.java.com.westpac.code.visitors.AreaVisitor;

/**
 * <p>This class will calculate area of 3 shapes, rectangle, circle and triangle with random inputs varying from 0 - LIMIT(default 100)</p>
 * 
 * <p>AreaCalculator class' main method creates a list of above shapes, one each 
 * and calculates area for each shape following Visitor pattern and using AreaVisitor class.</p>
 * 
 * @author gaurangpathare
 */
public class AreaCalculator {
	
public static void main(String[] args){
	
		//Input for shapes will be randomly generated between 0.0 - 100.0
		//To play with different inputs change the LIMIT value.
		final double LIMIT = 100; 
		Random random = new Random();
		
		
		List<Shape> shapes = new ArrayList<>();
		shapes.add(new Circle(getRandomDoubleNumber(LIMIT, random)));
		shapes.add(new Rectangle(getRandomDoubleNumber(LIMIT, random),getRandomDoubleNumber(LIMIT, random)));
		shapes.add(new Triangle(getRandomDoubleNumber(LIMIT, random), getRandomDoubleNumber(LIMIT, random)));
		
		calulateArea(shapes);
	}


	private static double getRandomDoubleNumber(final double MAX, Random random) {
		double number = random.nextDouble() * MAX;
		return formatNumber(number);
	}


	private static double formatNumber(double number) {
		/*For readability purpose we are formatting double to retain only 2 decimal places.
		 *formatted value, in form of (#.00)
		 */
		DecimalFormat df = new DecimalFormat("#.00");
		Double returnNumber = Double.valueOf(df.format(number));
		return returnNumber;
	}
	

	private static void calulateArea(List<Shape> shapes) {
		Visitor areaVisitor = new AreaVisitor();
		
		if(shapes !=null && !shapes.isEmpty()){
			for(Shape shape:shapes){
				String resultString = String.format("Area of shape '%s' is : %s", shape, formatNumber(shape.accept(areaVisitor)));
				System.out.println(resultString);
			}
		}
	}
}

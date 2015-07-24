package test.java.com.westpac.code.shapes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

import main.java.com.westpac.code.shapes.AbstractShape;
import main.java.com.westpac.code.shapes.Circle;
import main.java.com.westpac.code.visitors.AreaVisitor;

public class CircleTest {
	
	int positive = 10;
	int negative = -10;

	@Test
	public void testNameRetrunsCicle() {
		AbstractShape circle = new Circle(positive);
		assertTrue(circle.getName().equalsIgnoreCase(Circle.CIRCLE));
	}

	@Test
	public void testAcceptDoesntReturnZero(){
		double randomNumber = new Random().nextDouble() * 100;
		AbstractShape circle = new Circle(randomNumber);
		circle.accept(new AreaVisitor());
		assertFalse(circle.getArea() == 0.0);
	}
	
	@Test
	public void testAcceptReturnsZero(){
		AbstractShape circle = new Circle(negative);
		circle.accept(new AreaVisitor());
		assertTrue(circle.getArea() == 0.0);
	}
	
	@Test
	public void testAcceptReturnsCorrectValue(){
		AbstractShape circle = new Circle(positive);
		circle.accept(new AreaVisitor());
		assertTrue(circle.getArea() == 314.1592653589793);
	}
}

package test.java.com.westpac.code.shapes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

import main.java.com.westpac.code.shapes.Triangle;
import main.java.com.westpac.code.visitors.AreaVisitor;

public class TriangleTest {
	int positive = 10;
	int negative = -10;

	@Test
	public void testNameRetrunsRectangle() {
		Triangle triangle = new Triangle(positive, positive);
		assertTrue(triangle.getName().equalsIgnoreCase(Triangle.TRIANGLE));
	}

	@Test
	public void testAcceptDoesntReturnZero(){
		double randomNumber = new Random().nextDouble() * 100;
		double randomNumber1 = new Random().nextDouble() * 100;
		Triangle triangle = new Triangle(randomNumber, randomNumber1);
		triangle.accept(new AreaVisitor());
		assertFalse(triangle.getArea() == 0.0);
	}
	
	@Test
	public void testAcceptReturnsZero(){
		Triangle triangle = new Triangle(positive, negative);
		triangle.accept(new AreaVisitor());
		assertTrue(triangle.getArea() == 0.0);
	}
	
	@Test
	public void testAcceptReturnsCorrectValue(){
		Triangle triangle = new Triangle(positive, positive);
		triangle.accept(new AreaVisitor());
		assertTrue(triangle.getArea() == 50);
	}
}

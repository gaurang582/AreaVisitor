package test.java.com.westpac.code.shapes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

import main.java.com.westpac.code.shapes.Triangle;
import main.java.com.westpac.code.visitors.AreaVisitorImp;

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
		assertFalse(triangle.accept(new AreaVisitorImp()) == 0.0);
	}
	
	@Test
	public void testAcceptReturnsZero(){
		Triangle triangle = new Triangle(positive, negative);
		assertTrue(triangle.accept(new AreaVisitorImp()) == 0.0);
	}
	
	@Test
	public void testAcceptReturnsCorrectValue(){
		Triangle triangle = new Triangle(positive, positive);
		assertTrue(triangle.accept(new AreaVisitorImp()) == 50);
	}
}

package test.java.com.westpac.code.shapes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

import main.java.com.westpac.code.shapes.Circle;
import main.java.com.westpac.code.visitors.AreaVisitorImp;

public class CircleTest {
	
	int positive = 10;
	int negative = -10;

	@Test
	public void testNameRetrunsCicle() {
		Circle circle = new Circle(positive);
		assertTrue(circle.getName().equalsIgnoreCase(Circle.CIRCLE));
	}

	@Test
	public void testAcceptDoesntReturnZero(){
		double randomNumber = new Random().nextDouble() * 100;
		Circle circle = new Circle(randomNumber);
		assertFalse(circle.accept(new AreaVisitorImp()) == 0.0);
	}
	
	@Test
	public void testAcceptReturnsZero(){
		Circle circle = new Circle(negative);
		assertTrue(circle.accept(new AreaVisitorImp()) == 0.0);
	}
	
	@Test
	public void testAcceptReturnsCorrectValue(){
		Circle circle = new Circle(positive);
		assertTrue(circle.accept(new AreaVisitorImp()) == 314.1592653589793);
	}
}

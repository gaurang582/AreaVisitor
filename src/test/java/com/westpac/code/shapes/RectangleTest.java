package test.java.com.westpac.code.shapes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

import main.java.com.westpac.code.shapes.Rectangle;
import main.java.com.westpac.code.visitors.AreaVisitorImp;

public class RectangleTest {

	int positive = 10;
	int negative = -10;
	
	@Test
	public void testNameRetrunsRectangle() {
		Rectangle rectangle = new Rectangle(positive, positive);
		assertTrue(rectangle.getName().equalsIgnoreCase(Rectangle.RECTANGLE));
	}

	@Test
	public void testAcceptDoesntReturnZero(){
		double randomNumber = new Random().nextDouble() * 100;
		double randomNumber1 = new Random().nextDouble() * 100;
		Rectangle rectangle = new Rectangle(randomNumber, randomNumber1);
		assertFalse(rectangle.accept(new AreaVisitorImp()) == 0.0);
	}
	
	@Test
	public void testAcceptReturnsZero(){
		Rectangle rectangle = new Rectangle(positive, negative);
		assertTrue(rectangle.accept(new AreaVisitorImp()) == 0.0);
	}
	
	@Test
	public void testAcceptReturnsCorrectValue(){
		Rectangle rectangle = new Rectangle(positive, positive);
		assertTrue(rectangle.accept(new AreaVisitorImp()) == 100);
	}
}

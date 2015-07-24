package test.java.com.westpac.code.visitors;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

import main.java.com.westpac.code.shapes.Circle;
import main.java.com.westpac.code.visitors.AreaVisitor;
import main.java.com.westpac.code.visitors.Visitor;

public class AreaVisitorTest {
	
	int negative = -10;
	int positive = 10;

	@Test
	public void testVisitCircleWithNull() {
		Visitor visitor = new AreaVisitor();
		Circle circle = null;
		assertTrue(visitor.visit(circle) == 0);
	}
	
	@Test
	public void testVisitCircleWithNegativeRadius() {
		Visitor visitor = new AreaVisitor();
		Circle circle = new Circle(negative);
		assertTrue(visitor.visit(circle) == 0);
	}
	
	@Test
	public void testVisitCircleReturnsCorrectValue() {
		Visitor visitor = new AreaVisitor();
		Circle circle = new Circle(positive);
		assertTrue(visitor.visit(circle) == 314.1592653589793);
	}
	
	@Test
	public void testVisitCircleDoesntReturnZero() {
		Visitor visitor = new AreaVisitor();
		double randomNumber = new Random().nextDouble() * 100;
		Circle circle = new Circle(randomNumber);
		assertFalse(visitor.visit(circle) == 0);
	}

}

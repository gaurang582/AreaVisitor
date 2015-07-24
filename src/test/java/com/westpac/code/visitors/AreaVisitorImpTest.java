package test.java.com.westpac.code.visitors;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

import main.java.com.westpac.code.shapes.Circle;
import main.java.com.westpac.code.visitors.AreaVisitor;
import main.java.com.westpac.code.visitors.AreaVisitorImp;

public class AreaVisitorImpTest {
	
	int negative = -10;
	int positive = 10;

	@Test
	public void testVisitCircleWithNull() {
		AreaVisitor areaVisitor = new AreaVisitorImp();
		Circle circle = null;
		assertTrue(areaVisitor.visit(circle) == 0);
	}
	
	@Test
	public void testVisitCircleWithNegativeRadius() {
		AreaVisitor areaVisitor = new AreaVisitorImp();
		Circle circle = new Circle(negative);
		assertTrue(areaVisitor.visit(circle) == 0);
	}
	
	@Test
	public void testVisitCircleReturnsCorrectValue() {
		AreaVisitor areaVisitor = new AreaVisitorImp();
		Circle circle = new Circle(positive);
		assertTrue(areaVisitor.visit(circle) == 314.1592653589793);
	}
	
	@Test
	public void testVisitCircleDoesntReturnZero() {
		AreaVisitor areaVisitor = new AreaVisitorImp();
		double randomNumber = new Random().nextDouble() * 100;
		Circle circle = new Circle(randomNumber);
		assertFalse(areaVisitor.visit(circle) == 0);
	}

}

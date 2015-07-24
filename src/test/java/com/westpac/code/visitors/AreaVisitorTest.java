package test.java.com.westpac.code.visitors;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

import main.java.com.westpac.code.shapes.Circle;
import main.java.com.westpac.code.shapes.Rectangle;
import main.java.com.westpac.code.shapes.Triangle;
import main.java.com.westpac.code.visitors.AreaVisitor;
import main.java.com.westpac.code.visitors.Visitor;

public class AreaVisitorTest {
	
	int negative = -10;
	int positive = 10;

	@Test
	public void testVisitCircleWithNegativeRadius() {
		Visitor visitor = new AreaVisitor();
		Circle circle = new Circle(negative);
		visitor.visit(circle);
		assertTrue(circle.getArea() == 0);
	}
	
	@Test
	public void testVisitCircleReturnsCorrectValue() {
		Visitor visitor = new AreaVisitor();
		Circle circle = new Circle(positive);
		visitor.visit(circle);
		assertTrue(circle.getArea() == 314.1592653589793);
	}
	
	@Test
	public void testVisitCircleDoesntReturnZero() {
		Visitor visitor = new AreaVisitor();
		double randomNumber = new Random().nextDouble() * 100;
		Circle circle = new Circle(randomNumber);
		visitor.visit(circle);
		assertFalse(circle.getArea() == 0);
	}
	
	@Test
	public void testVisitRectangleWithNegativeLength() {
		Visitor visitor = new AreaVisitor();
		Rectangle rectangle = new Rectangle(negative, positive);
		visitor.visit(rectangle);
		assertTrue(rectangle.getArea() == 0);
	}
	
	@Test
	public void testVisitRectangleReturnsCorrectValue() {
		Visitor visitor = new AreaVisitor();
		Rectangle rectangle = new Rectangle(positive, positive);
		visitor.visit(rectangle);
		assertTrue(rectangle.getArea() == 100);
	}
	
	@Test
	public void testVisitRectangleDoesntReturnZero() {
		Visitor visitor = new AreaVisitor();
		double randomNumber = new Random().nextDouble() * 100;
		double randomNumber1 = new Random().nextDouble() * 100;
		Rectangle rectangle = new Rectangle(randomNumber, randomNumber1);
		visitor.visit(rectangle);
		assertFalse(rectangle.getArea() == 0);
	}

	
	@Test
	public void testVisitTriangleWithNegativeBase() {
		Visitor visitor = new AreaVisitor();
		Triangle triangle = new Triangle(positive, negative);
		visitor.visit(triangle);
		assertTrue(triangle.getArea() == 0);
	}
	
	@Test
	public void testVisitTriangleReturnsCorrectValue() {
		Visitor visitor = new AreaVisitor();
		Triangle triangle = new Triangle(positive, positive);
		visitor.visit(triangle);
		assertTrue(triangle.getArea() == 50);
	}
	
	@Test
	public void testVisitTriangleDoesntReturnZero() {
		Visitor visitor = new AreaVisitor();
		double randomNumber = new Random().nextDouble() * 100;
		double randomNumber1 = new Random().nextDouble() * 100;
		Triangle triangle = new Triangle(randomNumber, randomNumber1);
		visitor.visit(triangle);
		assertFalse(triangle.getArea() == 0);
	}


}

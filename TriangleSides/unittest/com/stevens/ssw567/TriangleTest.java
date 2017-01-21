package com.stevens.ssw567;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.stevens.ssw567.data.TriangleType;

public class TriangleTest {
	private static Triangle triangle;
	@BeforeClass
    public static void onceExecutedBeforeAll() { 
		triangle = new Triangle();
    	System.out.println("@BeforeClass: onceExecutedBeforeAll");
    }
	
	/**
	 * scalene [no side equal]
	 */
	@Test
	public void scaleneTest1() {
		assertEquals(TriangleType.SCALENE, triangle.classifyTriangle(1,2,3) );
	}
	@Test
	public void scaleneTest2() {
		assertEquals(TriangleType.SCALENE, triangle.classifyTriangle(3,2,1) );
	}
	@Test
	public void scaleneTest3() {
		assertEquals(TriangleType.SCALENE, triangle.classifyTriangle(2,1,3) );
	}
	
	
	
	/**
	 * isosceles [at least 2 side equal]
	 */
	@Test
	public void isoscelesTest1() {
		assertEquals(TriangleType.ISOSCELES, triangle.classifyTriangle(2,2,1) );
	}
	@Test
	public void isoscelesTest2() {
		assertEquals(TriangleType.ISOSCELES, triangle.classifyTriangle(2,1,2) );
	}
	@Test
	public void isoscelesTest3() {
		assertEquals(TriangleType.ISOSCELES, triangle.classifyTriangle(1,2,2) );
	}
	
	/**
	 * equilateral [all equal]
	 */
	@Test
	public void equilateralTest1() {
		assertEquals(TriangleType.EQUILATERAL, triangle.classifyTriangle(3.23232,3.23232,3.23232) );
	}
	@Test
	public void equilateralTest2() {
		assertEquals(TriangleType.EQUILATERAL, triangle.classifyTriangle(0.1,0.1,0.1) );
	}
	
	/**
	 * not triangle
	 */
	@Test
	public void notTriangleTest1() {
		assertEquals(TriangleType.NOT_TRIANGLE, triangle.classifyTriangle(-1, 1, 1) );
	}
	@Test
	public void notTriangleTest2() {
		assertEquals(TriangleType.NOT_TRIANGLE, triangle.classifyTriangle( 1,-1, 1) );
	}
	@Test
	public void notTriangleTest3() {
		assertEquals(TriangleType.NOT_TRIANGLE, triangle.classifyTriangle( 1, 1, -1) );
	}
	@Test
	public void notTriangleTest4() {
		assertEquals(TriangleType.NOT_TRIANGLE, triangle.classifyTriangle(-1,-1,-1) );
	}
	@Test
	public void notTriangleTest5() {
		assertEquals(TriangleType.NOT_TRIANGLE, triangle.classifyTriangle(0,0,0) );
	}
	@Test
	public void notTriangleTest6() {
		assertEquals(TriangleType.NOT_TRIANGLE, triangle.classifyTriangle(0,1,1) );
	}
	@Test
	public void notTriangleTest7() {
		assertEquals(TriangleType.NOT_TRIANGLE, triangle.classifyTriangle(1,0,1) );
	}
	@Test
	public void notTriangleTest8() {
		assertEquals(TriangleType.NOT_TRIANGLE, triangle.classifyTriangle(1,1,0) );
	}

}
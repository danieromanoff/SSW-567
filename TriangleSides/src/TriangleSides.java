/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danielle
 */
import javax.swing.JOptionPane;
public class TriangleSides extends GeometricObject {


	// Three double data fields named side1, side2, and side3 with default
    // values 1.0 to denote three sides of the triangle.
	private double side1 = 1, side2 = 1, side3 = 1;
	// A no-arg constructor that creates a default triangle.
	public TriangleSides()
	{
		
	}
	//  A constructor that creates a triangle with the specified side1, side2, and side3.
	public TriangleSides(double s1, double s2, double s3) throws Exception
	{
		if(s1 >= s2+s3 || s2 >= s3+s1 || s3 >= s2+s1)
		{
			Exception error = new Exception(" Invalid Input! Enter sides do not form a triangle");
			throw error;
		}
		else
		{
			side1 = s1;
			side2 = s2;
			side3 = s3;
		}
	}
	// The accessor methods for all three data fields.
	public double getSide1()
	{
		return side1;
	}
	public double getSide2()
	{
		return side2;
	}
	public double getSide3()
	{
		return side3;
	}
	// A method named getArea() that returns the area of this triangle.
	public double getArea()
	{
		double s = (side1+side2+side3)/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	// A method named getPerimeter() that returns the perimeter of this triangle.
	public double getPerimeter()
	{
		return side1+side2+side3;
	}
	// A method named toString() that returns a string description for the triangle.
	public String toString()
	{
		return "Triangle Side1: "+side1+ " Side 2: "+side2+" Side 3: "+side3;
	}
}


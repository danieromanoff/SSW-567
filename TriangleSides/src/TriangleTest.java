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

public class TriangleTest extends JOptionPane {
	public static boolean Valid(String value)
	{
		if(value.equalsIgnoreCase("true") || value.equalsIgnoreCase("false"))
			return true;
		else
			JOptionPane.showMessageDialog(null, "Invalid Input!! "+value+ "Enter either True or False", "error", JOptionPane.INFORMATION_MESSAGE);
		return false;
	}
	public static boolean Verify(String value)
	{
		try
		{
			Double.parseDouble(value);
			return true;
		}
		catch (Exception error)
		{
			JOptionPane.showMessageDialog(null,"Invalid Input: " + value +" Please enter a real number" ,"Error",JOptionPane.INFORMATION_MESSAGE);
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int check = JOptionPane.YES_OPTION;
		while(check == JOptionPane.YES_OPTION)
		{
			boolean repeat = true;
			String value;
			TriangleSides triangle = new TriangleSides();
			JOptionPane.showMessageDialog(null, "The program should create a Triangle object with these sides and set"
                                                + "\n the color and filled properties using the input. The program should display"
                                                +"\n the area, perimeter, color, and true or false to indicate whether it is filled or not. ", "Description",JOptionPane.INFORMATION_MESSAGE);
		while(repeat)
		{
			double s1,s2,s3;
			do
			{
				value = JOptionPane.showInputDialog(null, "Enter Side 1 of the triangle: ", "side1", JOptionPane.QUESTION_MESSAGE);
			}while(!Verify(value));
			s1 = Double.parseDouble(value);
			do
			{
				value = JOptionPane.showInputDialog(null, "Enter Side 2 of the triangle: ", "side2", JOptionPane.QUESTION_MESSAGE);
			}while(!Verify(value));
			s2 = Double.parseDouble(value);
			do
			{
				value = JOptionPane.showInputDialog(null, "Enter Side 3 of the triangle: ", "side3", JOptionPane.QUESTION_MESSAGE);
			}while(!Verify(value));
			s3 = Double.parseDouble(value);
			try
			{
				triangle = new TriangleSides(s1,s2,s3);
				repeat = false;
			}
			catch(Exception error)
			{
				JOptionPane.showMessageDialog(null, error.getMessage(), "error", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		do
		{
			value = JOptionPane.showInputDialog(null, "Enter true if Triangle is filled otherwise false if it is not filled: ", "fill", JOptionPane.QUESTION_MESSAGE);
		}while(!Valid(value));
		triangle.setIsFilled(value.equalsIgnoreCase("true"));
		value = JOptionPane.showInputDialog(null, "Enter the color of the triangle: ", "color", JOptionPane.QUESTION_MESSAGE);
		triangle.setColor(value);
		
		String result = "Details of the Triangle: \n";
		result += "Area: "+triangle.getArea();
		result += "\nPerimeter: "+triangle.getPerimeter();
		result += "\nColor: "+triangle.getColor();
		result += "\n Filled: "+triangle.isFilled();
		JOptionPane.showMessageDialog(null, result, "output", JOptionPane.INFORMATION_MESSAGE);
		check = JOptionPane.showConfirmDialog(null, "Do you want to re-run the program? ");
		
		}
	}

}


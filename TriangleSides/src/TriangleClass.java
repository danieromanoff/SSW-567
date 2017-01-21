import javax.swing.JOptionPane;
public class TriangleClass extends JOptionPane {

	// Three double data fields named side1, side2, and side3 with default
    // values 1.0 to denote three sides of the triangle.
	
	private double side1 = 1, side2 = 1, side3 = 1;
	// A no-arg constructor that creates a default triangle.
	
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
			TriangleClass triangle = new TriangleClass();
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
				triangle = new TriangleClass(s1,s2,s3);
				repeat = false;
			}
			catch(Exception error)
			{
				JOptionPane.showMessageDialog(null, error.getMessage(), "error", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
		JOptionPane.showMessageDialog(null,"The triangle is a ", "output", JOptionPane.INFORMATION_MESSAGE);
		check = JOptionPane.showConfirmDialog(null, "Do you want to re-run the program? ");
		
		}
	}

	public TriangleClass()
	{
		
	}
	//  A constructor that creates a triangle with the specified side1, side2, and side3.
	public TriangleClass(double s1, double s2, double s3) throws Exception
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
	// The accessing methods for all three data fields.
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
	
	// A method named ClassifyTriangle() that returns a string description for the triangle.
	public String ClassifyTriangle()
	{
		if (side1 == side2 && side2 == side3)
			return  "This is an Equilateral Triangle";
		
		else if ((side1 == side2 && side2 != side3) || (side1 != side2 && side3 == side1) || (side3 == side2 && side3 != side1))
			return "This is an Isosceles Triangle.";
		
		else if (side1 != side2 && side2 != side3 && side3 != side1)
			return "This is a Scalene Triangle.";
	}
}

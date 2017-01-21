import javax.swing.JOptionPane;


public class TriangleSides extends JOptionPane {
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

}

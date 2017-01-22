import java.util.Scanner;

public class TriangleSides
{
    public String classifyTriangle(int side1, int side2, int side3)
	{
		
		String result = "";
 
        //To check to see if it is an triangle
       // The sum of two smaller sides must be greater than the longest side to be a triangle
        if((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)
        {
            //To check to see if it an Equilateral triangle (3 equal sides)
            if((side1==side2) && (side2==side3))
            {
               result = "\n RESULT: This is an Equilateral Triangle and ";
            }
 
            //To check to see if it is an Isosceles triangle (2 of the same size and 1 different)
            else if ((side1 == side2) & (side2 != side3) || (side2 == side3) & (side3!= side1))
            {
                result = "\n RESULT: This is an Isosceles Triangle and ";
            }
 
            //To check to see if it is a Scalene triangle (3 different sizes)
            else if((side1 != side2) & (side2 != side3))
            {
                 result = "\n RESULT: This is a Scalene Triangle and ";
            }
            
            // Checking if the triangle is a right triangle
            if ((Math.pow(side1,2)+Math.pow(side2,2)==Math.pow(side3,2)) || (Math.pow(side1,2)+Math.pow(side3,2)==Math.pow(side2,2)) || (Math.pow(side2,2)+Math.pow(side3,2)==Math.pow(side2,2)))
            		{
            	    result += "this is a Right Triangle.";
            		}
            else 
            {
            	result += "and this is not a Right Triangle.";
            }
 
        }
 
        //Sum of two smaller sides is smaller than the longest side
        //When it is not a triangle it will print this.
        else
        {
            result = "\n These side lengths do not form a triangle.";
        }
       return result;    
     }          
     public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
 
        int side1, side2, side3;
 
        System.out.println("\nTo determine the type of triangle please enter the lengths of the sides. ");
 
        System.out.println("Side 1: ");
        side1 = keyboard.nextInt();
 
        System.out.println("Side 2: ");
        side2 = keyboard.nextInt();
 
        System.out.println("Side 3: ");
        side3 = keyboard.nextInt();
        
	TriangleSides obj = new TriangleSides();    
        System.out.println(obj.classifyTriangle(side1, side2, side3));
    }
}

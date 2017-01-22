enum Triangle
{
	Equilateral,
	Isosceles,
	Scalene,
	None
}
class TriangleClassification
{ 
	Triangle type;
	boolean rightAngle;
	public TriangleClassification(Triangle type,boolean rightAngle)
	{
		this.type = type;
		this.rightAngle = rightAngle;
	}
}
public class TriangleClassifier
{
	public static void main(String[] args)
	{
			TriangleClassification tri =  classifyTriangle(2,3,8);
			System.out.println(tri.type);
			System.out.println(tri.rightAngle);
		
	}
	static TriangleClassification classifyTriangle(double a,double b,double c)
	{
		//Applying Triangle properties (length of a side has to be less than the sum of the other sides, and length of a side
		// has to be greater than the difference of the other sides)
		if(a<=0 || b<=0 || c<= 0 || a>b+c || a<Math.abs(b-c) || b>a+c || b<Math.abs(a-c) || c>a+b || c<Math.abs(a-b))
		{
			return new TriangleClassification(Triangle.None,false); 
		}
		//all sides are equal (Equilateral) (can't have a right angle)
		else if(a==b&&b==c)
		{
			return new TriangleClassification(Triangle.Equilateral,false);
		}
		//two sides are equal (Isosceles)
		else if(a==b||a==c||b==c)
		{
			//Check if it has a right angle or not (pythagorean rule)
			boolean rightAngle = ((int)(a*a+b*b)==(int)(c*c)) || ((int)(a*a+c*c)==(int)(b*b)) || ((int)(b*b+c*c)==(int)(a*a));
			return new TriangleClassification(Triangle.Isosceles,rightAngle);
		}
		//No equal sides (Scalene)
		else if(a!=b&&a!=c&&b!=c)
		{
			//Check if it has a right angle or not (pythagorean rule)
			boolean rightAngle = (a*a+b*b==c*c) || ((a*a+c*c==b*b)) || ((b*b+c*c==a*a));
			return new TriangleClassification(Triangle.Scalene,rightAngle);
		}
		return null; //Something went wrong!
	}
}
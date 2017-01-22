enum Triangle
{
	Equilateral,
	Isosceles,
	Scalene,
	Not_Triangle
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
			TriangleClassification tri1 =  classifyTriangle(2,3,8);
			TriangleClassification tri2 =  classifyTriangle(2,2,3);
			TriangleClassification tri3 =  classifyTriangle(3,3,3);
			TriangleClassification tri4 =  classifyTriangle(5,5,8);
			TriangleClassification tri5 =  classifyTriangle(6,8,10);
			System.out.println("Triangle 1: (2,3,8)");
			System.out.println("Triangle Class: "+tri1.type);
			System.out.println("Right Angles: "+String.valueOf(tri1.rightAngle)+'\n');
			System.out.println("Triangle 2: (2,2,3)");
			System.out.println("Triangle Class: "+tri2.type);
			System.out.println("Right Angles: "+String.valueOf(tri2.rightAngle)+'\n');
			System.out.println("Triangle 3: (3,3,3)");
			System.out.println("Triangle Class: "+tri3.type);
			System.out.println("Right Angles: "+String.valueOf(tri3.rightAngle)+'\n');
			System.out.println("Triangle 4: (5,5,8)");
			System.out.println("Triangle Class: "+tri4.type);
			System.out.println("Right Angles: "+String.valueOf(tri4.rightAngle)+'\n');
			System.out.println("Triangle 5: (6,8,10)");
			System.out.println("Triangle Class: "+tri5.type);
			System.out.println("Right Angles: "+String.valueOf(tri5.rightAngle)+'\n');
		
	}
	static TriangleClassification classifyTriangle(double a,double b,double c)
	{
		//Applying Triangle properties (length of a side has to be less than the sum of the other sides, and length of a side
		// has to be greater than the difference of the other sides)
		// As requested, added a bug by commenting the code that checks if the length of the sides is greater than zero
		if(/*a<=0 || b<=0 || c<= 0 ||*/ a>b+c || a<Math.abs(b-c) || b>a+c || b<Math.abs(a-c) || c>a+b || c<Math.abs(a-b))
		{
			return new TriangleClassification(Triangle.Not_Triangle,false); 
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
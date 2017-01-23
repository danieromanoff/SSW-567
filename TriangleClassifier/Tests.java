import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import java.lang.Math;
public class Tests {
	
  @Before
	public void Before()
	{
		int a = 1, b = 1 , c = 1;
		TriangleClassification tri = TriangleClassifier.classifyTriangle(a,b,c);
		assertEquals(Triangle.Equilateral,tri.type);
	}
  
  @Test
  public void Equilateral() 
  {
  	TriangleClassification tri =  TriangleClassifier.classifyTriangle(6,6,6);
    assertEquals(Triangle.Equilateral,tri.type);
    assertEquals(false,tri.rightAngle);
  }
  @Test
  public void IsoscelesWithRightAngle() 
  {
  	TriangleClassification tri =  TriangleClassifier.classifyTriangle(5,5,((double)5 * Math.sqrt(2)));
    assertEquals(Triangle.Isosceles,tri.type);
    assertEquals(true,tri.rightAngle);
  }
  
  @Test
  public void Isosceles() 
  {
  	TriangleClassification tri =  TriangleClassifier.classifyTriangle(5,5,8);
    assertEquals(Triangle.Isosceles,tri.type);
    assertEquals(false,tri.rightAngle);
  }
  
  @Test
  public void Scalene() 
  {
  	TriangleClassification tri =  TriangleClassifier.classifyTriangle(2,3,4);
    assertEquals(Triangle.Scalene,tri.type);
    assertEquals(false,tri.rightAngle);
  }
  
  @Test
  public void ScaleneWithRightAngle() 
  {
  	TriangleClassification tri =  TriangleClassifier.classifyTriangle(6,8,10);
    assertEquals(Triangle.Scalene,tri.type);
    assertEquals(true,tri.rightAngle);
  }
    @Test
  public void NotTriangle1() 
  {
  	TriangleClassification tri =  TriangleClassifier.classifyTriangle(0,0,0);
    assertEquals(Triangle.Not_Triangle,tri.type);
    assertEquals(false,tri.rightAngle);
  }
  
  @Test
  public void NotTriangle2() 
  {
  	TriangleClassification tri =  TriangleClassifier.classifyTriangle(1,1,10);
    assertEquals(Triangle.Not_Triangle,tri.type);
    assertEquals(false,tri.rightAngle);
  }
  
  @Test(timeout=1)
	public void Performance()
	{
		TriangleClassification tri = TriangleClassifier.classifyTriangle(10,50,10);
	}

}

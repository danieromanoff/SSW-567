
class classifyTriangle {

   // Stores the length of each side of the Triangle object.
   private int side1, side2, side3;

   // Constructor to initialize the sides of the triangle.
   public classifyTriangle (int s1, int s2, int s3) {
      side1 = s1;
      side2 = s2;
      side3 = s3;
   }

   // Method to test for a right-angled triangle.
   public boolean is_right () {
      if (((side1*side1) == ((side2*side2) + (side3*side3))) ||
          ((side2*side2) == ((side1*side1) + (side3*side3))) ||
          ((side3*side3) == ((side1*side1) + (side2*side2))))
         return true;
      else
         return false;
   }

   // Method to test for a scalene triangle.
   public boolean is_scalene () {
      if ((side1 != side2) && (side1 != side3) && (side2 != side3))
         return true;
      else
         return false;
   }

   // Method to test for an isosceles triangle.
   public boolean is_isosceles () {
      if (((side1 == side2) && (side1 != side3)) ||
          ((side1 == side3) && (side1 != side2)) ||
          ((side2 == side3) && (side2 != side1)))
         return true;
      else
         return false;
   }

   // Method to test for an equilateral triangle.
   public boolean is_equilateral () {
      if ((side1 == side2) && (side1 == side3))
         return true;
      else
         return false;
   }
}
public static void main (String[] args) throws IOException {

      // Declare stdin so data can be read from input.
      DataInputStream stdin = new DataInputStream (System.in);

      // loop exits when the user response is "n"
      String entries = "y";
      while (!entries.equals("n")) {

         // Ask user for 3 dimensions of triangle.
         System.out.println ("\nEnter side1 length: ");
         int side1 = Integer.parseInt (stdin.readLine());

         System.out.println ("Enter side2 length: ");
         int side2 = Integer.parseInt (stdin.readLine());

         System.out.println ("Enter side3 length: ");
         int side3 = Integer.parseInt (stdin.readLine());

         // Now use these values to create a Triangle object.
         Triangle tri = new Triangle (side1,side2,side3);

         // Determine what kind of triangle it is.
         System.out.println ("\nIs triangle right-angle? "+tri.is_right());
         System.out.println ("Is triangle scalene?     "+tri.is_scalene());
         System.out.println ("Is triangle isosceles?   "+
                                                       tri.is_isosceles());
         System.out.println ("Is triangle equilateral? "+
                                                     tri.is_equilateral());
         // Ask user if they want to continue.
         System.out.println ("\nDo you want to examine more triangles?");
         System.out.println ("(type 'y' for yes or 'n' for no)");
         user_response = stdin.readLine();
      }
   }
}

import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
    System.out.println("Enter int to make right angled triangle");
    Scanner in = new Scanner(System.in);
    int loops = in.nextInt();
    for(int i = 0;i<loops;i++)
    {
      for (int ii=0; ii<loops-i; ii++)
      {
        System.out.print("*");
    
      }
      System.out.println();
  
      
    }
    in.close();

  }
}

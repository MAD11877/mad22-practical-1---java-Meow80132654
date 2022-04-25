import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    System.out.println("Enter number of loops: ");
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int array[] =new int[size];
    for (int i = 0;i<size;i++)
    {
      int value = in.nextInt();
      array[i] = value;

    }
    int maxvalue = 0;
    int maxcount = 0;
    for(int i = 0;i<size;i++)
    {
      int count = 0;
      for (int j = 0; j < size; ++j) {
        if (array[j] == array[i])
        ++count;

      }
      if (count > maxcount) {
        maxcount = count;
        maxvalue = array[i];

     }
    }
    System.out.println("Mode is: "+maxvalue);
    in.close();
    

    
  }
}

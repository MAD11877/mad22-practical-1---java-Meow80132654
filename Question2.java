import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    System.out.println("Prompts user for height and weight, calculate and print out the BMI of the user");
    Scanner in = new Scanner(System.in);
    double height = in.nextDouble();
    double weight = in.nextDouble();
    double bmi = height/(weight*weight);
    System.out.println("Your bmi is " + bmi);  
    in.close();



  }
}

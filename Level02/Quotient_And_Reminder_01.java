import java.util.Scanner;

public class Quotient_And_Reminder_01{

   public static void main(String[] args) {

	  Scanner input = new Scanner(System.in);

      // Taking input of first number:
      System.out.println("Enter the first number");
      int first = input.nextInt();

      // Taking input of second number:
      System.out.println("Enter the second number");
      int second = input.nextInt();

      // Calculate the quotient and remainder
      int quotient = first / second;
      int remainder = first % second;

      // display the result
      System.out.println("The Quotient is " + quotient + " and Reminder is " 
	  + remainder + " of two numbers " + first + " and " + second);

      input.close();
   }
}	
import java.util.Scanner;

public class Swap_Two_Numbers_07{
	
    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
        
      // Taking input of first number:
      System.out.println("Enter the first number");
      int number1 = input.nextInt();

      // Taking input of second number:
      System.out.println("Enter the second number");
      int number2 = input.nextInt();

      //Swapping two number using third variable
      int tempNo = number1;
      number1 = number2;
      number2 = tempNo;

      //Printing the result
      System.out.println("The swapped numbers are "+ number1 
	  +" and " + number2);

      input.close();
    }  
}
import java.util.Scanner;

public class DoubleOpt_Program_03{
	
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        // Take input from the user in variable a, b, c.
        System.out.print("Enter value for a: ");
        double a = input.nextDouble();
        
        System.out.print("Enter value for b: ");
        double b = input.nextDouble();
        
        System.out.print("Enter value for c: ");
        double c = input.nextDouble();
        
        // Calculating the values:
        double result1 = a + b * c;        // a + (b * c)
        double result2 = a * b + c;        // (a * b) + c
        double result3 = c + a / b;        // c + (a / b)
        double result4 = a % b + c;        // (a % b) + c
        
        // Printing the results
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 
		+ ", " + result3 + ", and " + result4 + ".");    
        
        input.close();
    }
}
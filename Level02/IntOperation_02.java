import java.util.Scanner;

public class IntOperation_02 {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        // Take input from the user in variable a, b, c.
        System.out.print("Enter value for a: ");
        int a = input.nextInt();
        
        System.out.print("Enter value for b: ");
        int b = input.nextInt();
        
        System.out.print("Enter value for c: ");
        int c = input.nextInt();
        
        // Calculating the values :
        int result01 = a + b * c;        // a + (b * c)
        int result02 = a * b + c;        // (a * b) + c
        int result03 = c + a / b;        // c + (a / b)
        int result04 = a % b + c;        // (a % b) + c
        
        // Printing the results:
        System.out.println("The results of Int Operations are " + result01 + ", " 
		+ result02 + ", " + result03 + ", and " + result04 + ".");
        
        input.close();
    }
}
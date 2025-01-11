import java.util.Scanner;

public class Calculator_06 {
	
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Taking input from user
        System.out.println("Enter first number: ");
        double first = input.nextDouble();

        //Taking input from user
        System.out.println("Enter second number: ");
        double second = input.nextDouble();
 
        //Taking input from user
        System.out.println("Enter a operators(+, -, *, /): ");
        String op = input.next();

        //calculating the answer
        double answer = 0;
        for(int i=0;i<op.length();i++){
			
            char c=op.charAt(i); 
         
            switch(c){

            case '+':
               answer= first + second;
               System.out.println("Addition of number " + first 
			   + " and " + second + " is " + answer);
               break;

            case '-':
               answer= first - second;
               System.out.println("Substraction of number " + first 
			   + " and " + second + " is " + answer);
               break;

            case '*':
               answer= first * second;
               System.out.println("Multiplication of number " + first 
			   + " and " + second + " is " + answer);
               break;
             
            case '/':
               answer= first / second;
               System.out.println("Division of number " + first 
			   + " and " + second + " is " + answer);
               break;
             
            default :
               System.out.println("Invalid Operator");
               break;

          }
        }
       
        input.close();
    }
}
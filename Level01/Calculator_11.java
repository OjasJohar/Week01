import java.util.Scanner;

public class Calculator_11{

	public static void main(String[] args){
		
        Scanner input =new Scanner(System.in);
                
        //Enter the first number:
        System.out.println("Enter the first number ");
        int first =input.nextInt();
 
        //Enter the second number:
        System.out.println("Enter the second number ");
        int second =input.nextInt();

        //calculating:
        int add= first + second;
        int sub= first - second;
        int mul= first * second;
        double div= (double)first / (double)second;

        //printing the output of calculations
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + 
		first + " and " + second +  " is " + add + ", "+ sub + ", " + mul + ", and "+ div);

        input.close();
	}
}
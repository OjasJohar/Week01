import java.util.Scanner;

public class FactorialUsingRecursion_06{
	
	//method to take input
	public static int takingInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int input=scanner.nextInt();
		scanner.close();
		
		return input;
	}
	
	//method to calculate factorial
	public static long calculateFactorial(int number){
		
		if(number==1){
			return 1;
		}
		
		return number * calculateFactorial(number-1);	
	}
	
	//method to display result
	public static void displayResult(int number, long factorial){
		
		System.out.println("The factorail of " + number + " is " + factorial);
	}
	
	public static void main(String[] args){
		
		//taking input from the user
		int number=takingInput();
		
		//calculating facrtorial of a number
		long factorial = calculateFactorial(number);
		
		//displaying the result
		displayResult(number, factorial);
		
	}
}
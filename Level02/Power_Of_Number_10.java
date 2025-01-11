//Calculating power using loop 

import java.util.Scanner;

public class Power_Of_Number_10{
	public static void main(String []args){

		//Creating Scanner class
		Scanner input = new Scanner(System.in);
		
		//Taking the input from user
        System.out.println("Enter the Number");
		int number = input.nextInt();
		
		System.out.println("Enter the power");
		int power = input.nextInt();
		
		int result = 1;
		
		//Calculating power
		for(int i = 1 ; i <= power; i++){
			result *= number;
		}
		
		//Printing the result
		System.out.println("The result is "+ result);
		
		input.close();
		
	}
}
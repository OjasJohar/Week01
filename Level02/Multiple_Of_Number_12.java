//Calculating the multiples of the number

import java.util.Scanner;

public class Multiple_Of_Number_12{

	public static void main(String []args){

		//Creating Scanner class:
		Scanner input = new Scanner(System.in);
		
		//Taking the no. as input
        System.out.println("Enter the Number");
		int number = input.nextInt();
		
		//Calculating the multiples and printing them:
		for(int i=100; i>=1; i--){
			if(i % number == 0){
				System.out.println(i+" is a multiple of the number "+number);
			}
		}
	}
}
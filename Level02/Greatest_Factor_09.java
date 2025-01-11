// Finding the Greatest Factor by Loop

import java.util.Scanner;

public class Greatest_Factor_09{

	public static void main(String []args){

		//Creating Scanner class
		Scanner input = new Scanner(System.in);
		
		//Taking the number as input
        System.out.println("Enter the Number");
		int number = input.nextInt();
		
		int greatestFactor = 1;
		
		//calculating the greatest factor
		for(int i = number - 1; i>= 1; i--){
			if(number % i == 0){
				greatestFactor = i;
				break;
			}
		}
	
		//printing the greatestFactor
		System.out.println("The GreatestFactor of the Number "+ number 
        +" is "+ greatestFactor);
		
		input.close();
	}
}
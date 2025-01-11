// Calculating the factor using loop


import java.util.Scanner;

public class Factors_Of_Number_11{

	public static void main(String []args){

		//Creating Scanner class
		Scanner input = new Scanner(System.in);
		
		//Taking the no. as input
        System.out.println("Enter the Number");
		int number = input.nextInt();
		
		//Calculating the factors of the numbers
		for(int i=1; i<=number; i++){
			if(number % i == 0){
				System.out.println(i +" is a factor of number "+ number);
			}
		}
		
        input.close();
		
	}
}
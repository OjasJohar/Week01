import java.util.Scanner;

public class NumberOfRounds_04{
	
	//Method to calculate maximum number of rounds 
	public double calculateRounds(double len1, double len2, double len3){
	
	    //calculating perimeter
		double perimeter= len1+ len2 +len3;
		
		//creating runnable length variable
		double runLength=5000;
		
		//calculating rounds
		double rounds= runLength /perimeter;
		
		return rounds;
	}
	
	public static void main(String[] args){
		
		//Creating Scanner object
		Scanner input = new Scanner(System.in);
		
		//Taking user input in length 1 variable
		System.out.println("Enter the length of side1: ");
		double length01 = input.nextDouble();
	
	    //taking user input in length 2 variable
		System.out.println("Enter the length of side2: ");
		double length02 = input.nextDouble();
		
		//taking user input in length 3 variable
		System.out.println("Enter the length of side3: ");
		double length03 = input.nextDouble();
		
	    //calculating the maximun number of rounds he can run
		NumberOfRounds_04 obj=new NumberOfRounds_04();
		double rounds=obj.calculateRounds(length01,length02,length03);
		
		//printing the result
		System.out.println("The maximum number of rounds user needs to do to complete 5km run is " + rounds + ".");
		
		//Closing the Scanner class
		input.close();
	}
	
}
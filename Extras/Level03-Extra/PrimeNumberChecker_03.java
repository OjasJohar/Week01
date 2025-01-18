import java.util.Scanner;

public class PrimeNumberChecker_03{
	
	//method to check for prime number
	public static boolean isPrime(int number){
		for(int i=2;i<number;i++){
			if(number%i==0){
			   return false;	
			}	
		}
		return true;
	}
	
	public static void main(String[] args){
		//Creating Scanner object
		Scanner scanner =new Scanner(System.in);
		
		//taking input from the user
		System.out.println("Enter a Number:");
		int number = scanner.nextInt();
		
		boolean prime=isPrime(number);
		
		//printing the result
		if(prime==true){
			System.out.println("It is a Prime number.");
		}else{
		    System.out.println("It is not a Prime number.");
		}
		//Closing Scanner class
		scanner.close();
	}
}
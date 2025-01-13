import java.util.Scanner;

class SimpleInterest_01{
	
	//Method to calculate simple Interest
	public double calculateSimpleInterest(double principal, double rate, double time){	
		
		//calculating simple interest using formula
		double Interest= principal * rate * time / 100;
		return Interest;
	}	
	
	public static void main(String[] args){
		
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//taking user input in principle variable
		System.out.println("Enter the principal amount: ");
		double principal=input.nextDouble();
		
		//taking user input in rate variable
		System.out.println("Enter the rate of interest: ");
		double rate = input.nextDouble();
		
		//taking user input in time variable
		System.out.println("Enter the time of interest: ");
		double time = input.nextDouble();
		
		SimpleInterest_01 obj=new SimpleInterest_01();
		//calculating the simple interest
		double simpleInterest=obj.calculateSimpleInterest(principal, rate, time);
		
		//printing the result
		System.out.println("The Simple Interest is "+ simpleInterest +" for Principal "
		+ principal +", Rate of Interest "+ rate +"% and Time "+ time + " years. ");
		
		//Closing Scanner class
		input.close();
	}	
}
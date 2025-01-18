import java.util.Scanner;

public class GCDandLCMcalculator_07{
	
	//method to calculate GCD
	public static int calculateGCD(int first, int second){
        if (second == 0)
            return first;
        else
            return calculateGCD(second, Math.abs(first - second));
	}
	
	//method to calculate LCM
    public static int calculateLCM(int first, int second){
		return (first/ calculateGCD(first, second)) * second;   //lcm*hcf=first*second
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		//taking input from the user
		System.out.println("Enter the first Number:");
		int first=scanner.nextInt();
		
		//taking input from the user
		System.out.println("Enter the second Number:");
		int second=scanner.nextInt();
		
		//calculating GCD 
		int gcd=calculateGCD(first, second);
		
		//calculating LCM 
        int lcm=calculateLCM(first, second);	

        System.out.println("The GCD of numbers " + first + " and " + second +" is : " + gcd);		
		System.out.println("The LCM of numbers " + first + " and " + second +" is : " + lcm);
	}
}
import java.util.Scanner;

public class Spring_Season_07{
	
	public static void main(String[] args){
		
		Scanner input= new Scanner(System.in);
		
		//Taking month from user:
		System.out.println("Enter the month");
		int month= input.nextInt();
		
		//Taking day from user:
		System.out.println("Enter the day");
		int day= input.nextInt();
		
		//Checking if the input is spring season or not
		if ((month == 3 && day >= 20) || (month >3 && month <6 )
			|| (month == 6 && day <= 20 )){
			System.out.println("Its a Spring Season");	
		} else {
			System.out.println("Not a Spring Season");
		}	
	}
}	
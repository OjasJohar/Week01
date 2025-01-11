import java.util.Scanner;

public class Person_Can_Vote_05{
	
	public static void main(String[] args){
		
		Scanner input= new Scanner(System.in);
		
		//Taking input from user:
		System.out.println("Enter the age :");
		int age= input.nextInt();
		
		//Checking if the age is more than or equal to 18:
		if(age >= 18){
			//Printing the result:
			System.out.println("The person's age is " + age +" and can vote.");
		} else {
			//Printing the result:
            System.out.println("The person's age is " + age +" and cannot vote.");
		}
		
		input.close();
	}
}	
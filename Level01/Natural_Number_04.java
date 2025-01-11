import java.util.Scanner;

class Natural_Number_04{
	
	public static void main(String[] args){
		
		Scanner input= new Scanner(System.in);
		
		//Taking input from user:
		System.out.println("Enter the number ");
		int number=input.nextInt();
		
		//Checking if the number is positive or not:
		if(number>=0){
			int sum = number * (number + 1) / 2;
            System.out.println("The sum of "+ number + " natural numbers is " + sum );			
		}else {			
			System.out.println("The number " + number + " is not a natural number");
		}

        input.close();
	}		
	
}
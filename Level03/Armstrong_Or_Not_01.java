import java.util.Scanner;

public class Armstrong_Or_Not_01 {
	
    public static void main(String[] args) {

        //Creating Scanner class
		Scanner input = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        //defining sum variable 
        int sum=0;
        int originalNumber=number;

        //calculating armstrong number using while loop
        while(originalNumber != 0 ){
           int remainder = originalNumber % 10;
           originalNumber = originalNumber / 10 ;
           sum = sum + remainder * remainder * remainder;
        }

        //printing the output
        if(sum == number){
            System.out.println("It's an Armstrong number");
        }else{
            System.out.println("It's not an Armstrong number");
        }

        input.close();
    }
}
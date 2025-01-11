import java.util.Scanner;

public class Harshad_Number_03 {
	
    public static void main(String[] args) {

        //Creating Scanner class
		Scanner input = new Scanner(System.in);

        //Taking input from user:
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        //defining sum variable 
        int sum=0;
        int originalNumber=number;

        //calculating harshad number using while loop
        while(originalNumber != 0 ){
           int remainder = originalNumber % 10;
           originalNumber = originalNumber / 10 ;
           sum = sum + remainder ;  
        }

        //printing the output
        if(number%sum==0){
           System.out.println("It's an Harshad number");
        }else{
           System.out.println("It's not an Harshad number");
        }

        input.close();
    }
}
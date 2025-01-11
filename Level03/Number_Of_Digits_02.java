import java.util.Scanner;

public class Number_Of_Digits_02 {
	
    public static void main(String[] args) {

        //Creating Scanner class
		Scanner input = new Scanner(System.in);

        //Taking input from user:
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        //defining count variable 
        int count=0;
        int originalNumber=number;

        //calculating count of digits in number using while loop
        while(originalNumber != 0 ){
           count++;
           originalNumber= originalNumber/10;
        }

        //printing the output
        System.out.println("There are " + count + " digits in the number " + number + ".");
       
        input.close();
    }
}
import java.util.Scanner;

public class SumOfNaturalNumbers_07 {

    // method to find the sum of n natural numbers
    public int findSum(int number) {
		int sum=0;
        // calculating sum using loop
        for(int i=1;i<=number;i++){
			sum = sum + i;
		}
        return sum;
    }

    public static void main(String[] args) {
		
		//Creating Scanner object
        Scanner input = new Scanner(System.in);

        //Taking user input in number variable
        System.out.println("Enter the natural Number: ");
        int number = input.nextInt();
        while (true) {
            if (number <= 0) {
                System.out.println("Invalid Input, Enter natural number:");
                number = input.nextInt();
            } else {
                break;
            }
        }

        //Calculating sum of n natural number
        SumOfNaturalNumbers_07 obj = new SumOfNaturalNumbers_07();
        int sum = obj.findSum(number);

        //Printing the output
        System.out.println("The sum of " + number + " natural number is: " + sum);

        //Closing Scanner class
		input.close();
    }

}
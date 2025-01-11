import java.util.Scanner;

public class Simple_Interest_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input in principal variable
        System.out.println("Enter the principle");
        double principle = input.nextDouble();
        
        // Taking input in rate variable
        System.out.println("Enter the rate of interest");
        double rate = input.nextDouble();
        
        // Taking input in time variable
        System.out.println("Enter the time");
        double time = input.nextDouble();

        //Calculating the simple interest:
        double simpleInterest = principle * rate * time / 100 ;

        // Printing the output
        System.out.println("The simple interest is " + simpleInterest +" for principle "
		+ principle + ", rate of interest " + rate + " and Time " + time );

        input.close();
    }
}
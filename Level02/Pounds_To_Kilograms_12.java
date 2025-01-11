import java.util.Scanner;

public class Pounds_To_Kilograms_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input in weight variable
        System.out.println("Enter the weight in pounds");
        double weightInPound = input.nextDouble();

        //Calculating weight in kilograms
        double weightInKilogram = weightInPound * 2.2 ;

        // Printing the output
        System.out.println("The weight of the person in pound is " 
		+ weightInPound +" and in kg is " + weightInKilogram + ".");
        
        input.close();
    }
}
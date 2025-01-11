import java.util.Scanner;

public class Fahrenheit_To_Celsius_05{
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        //Taking the temperature input in fahrenheit variable.
        System.out.println("Enter the Temperature in fahrenheit");
        double fahrenheit = input.nextDouble();

        //Calculating the temperature in fehrenheit
        double celsiusResult = ( fahrenheit -32) * 5 /9;

        //Printing the output:
        System.out.println("The "+ fahrenheit + " fahrenheit is " 
		+ celsiusResult + " celsius.");
        
        input.close();
    }
}
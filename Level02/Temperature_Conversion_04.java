import java.util.Scanner;

public class Temperature_Conversion_04{
	
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        //Taking the temperature input in celsius variable.
        System.out.println("Enter the Temperature in Celsius");
        double celsius = input.nextDouble();

        //Calculating the temperature in fehrenheit
        double fahrenheitResult = ( celsius *9 /5 ) +32;

        //Printing the output:
        System.out.println("The "+ celsius + " celsius is " 
		+ fahrenheitResult + " fahrenheit.");
        
        input.close();
    }
}
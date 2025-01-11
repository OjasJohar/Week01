import java.util.Scanner;

public class Centimeters_To_Feet_10{

	public static void main(String[] args){
		
        Scanner input = new Scanner(System.in);
                
        //Taking user height's as input in cm:
		System.out.println("Enter user's height : ");
        double heightInCm = input.nextDouble();
               
        //Calculating user height in feet:
        double heightInFeet = heightInCm / (12 *2.54);
               
              
        //Calculating user height in inch:
        double heightInInch = heightInCm / 2.54;

        //printing user height in feet and inch:
        System.out.println("Your Height in cm is " + heightInCm +" while in feet is " 
		+ heightInFeet + " and inches is " + heightInInch);

        input.close();
 
	}
}
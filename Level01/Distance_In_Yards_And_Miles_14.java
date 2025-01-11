import java.util.Scanner;

public class Distance_In_Yards_And_Miles_14{

	public static void main(String[] args){
		
        Scanner input =new Scanner(System.in);

        //Taking the input in feet:
        System.out.println("Enter the distance in feet");
        double distanceInFeet = input.nextDouble();
  
        //Calculating the distance in yard:
        double distanceInYard = distanceInFeet /3;
               
        //Calculating the distance in miles:
        double distanceInMiles = distanceInYard /1760;

        //Printing the distance in miles and yard:
        System.out.println("The distance in yards is "+ distanceInYard +
		" while the distance in miles is " + distanceInMiles);

        input.close();
	}
}
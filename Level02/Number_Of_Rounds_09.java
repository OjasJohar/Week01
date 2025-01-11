import java.util.Scanner;

public class Number_Of_Rounds_09 {
	
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input of side 1
        System.out.println("Enter the length of first side of park in meter");
        double side01 = input.nextDouble();

        // Taking input of side 2
        System.out.println("Enter the length of second side of park in meter");
        double side02 = input.nextDouble();

        // Taking input of side 3
        System.out.println("Enter the length of third side of park in meter");
        double side03 = input.nextDouble();

        // Calculating the perimeter of park
        double perimeter = side01 + side02 + side03;

        // Calculating the total number of rounds around the park come under 5km
        double round = 5000 / perimeter;

        // printing the output
        System.out.println("The total number of rounds the athlete will run is " 
		+ round + " to complete 5 km.");

        input.close();
    }
}
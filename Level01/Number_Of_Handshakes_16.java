import java.util.Scanner;

public class Number_Of_Handshakes_16{

	public static void main(String[] args){
		
        Scanner input =new Scanner(System.in);

        //Taking input for numberOfStudents variable:
        System.out.println("Enter the total number of students");
        int numberOfStudent=input.nextInt();

        //Calculating total number of handshakes:
        long numberOfHandshakes = (numberOfStudent * (numberOfStudent -1))/2;

        //Displaying the total number of handshakes:
        System.out.println("The total number of hand shakes among " 
		+ numberOfStudent + " is " + numberOfHandshakes); 

        input.close();
	}
}
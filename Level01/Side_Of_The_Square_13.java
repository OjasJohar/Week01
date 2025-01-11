import java.util.Scanner;

public class Side_Of_The_Square_13{

	public static void main(String[] args){
		
        Scanner input =new Scanner(System.in);

        //Taking the parimeter input:
        System.out.println("Enter the perimeter of a Square");
        double perimeter =input.nextDouble();

        //Calculating the length of a side of square:
        double side= perimeter/4; 

        //Printing side of square: 
        System.out.println("The length of the side is " + side + 
		" whose perimeter is " + perimeter);            

        input.close();
	}
}
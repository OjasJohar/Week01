import java.util.Scanner;

public class Kilometers_To_Miles_08{
	
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
		
        System.out.println("Enter the Distance in kilometer ");
		// Taking input from user via Scanner class:
        double kilometer=input.nextDouble();

        //calculating miles for given kilometers:
        double miles=kilometer / 1.6;

        //printing distance in kilometer and miles
        System.out.println("The total miles is " + miles
		+ " mile for the given " + kilometer +" Km ");

        input.close();
    }
}
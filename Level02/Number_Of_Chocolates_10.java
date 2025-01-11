import java.util.Scanner;

public class Number_Of_Chocolates_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input of number Of chocolates
        System.out.println("Enter the number Of chocolates");
        int numberOfChocolates = input.nextInt();

        // Taking input of number Of Children
        System.out.println("Enter the number Of Children");
        int numberOfChildren = input.nextInt();

        //Calculating the distribution of chocolates among children
        int distributedChoco = numberOfChocolates / numberOfChildren ;

        //Calculating the remaining number of chocolates 
        int remainingChoco = numberOfChocolates % numberOfChildren ;

        // Printing the output
        System.out.println("The number of chocolates each child gets is "+ distributedChoco 
		+" and the number of remaining chocolates is "+ remainingChoco + "." );

        input.close();
    }

}
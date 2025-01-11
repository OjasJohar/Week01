import java.util.Scanner;

public class Total_Price_15{

	public static void main(String[] args){
		
        //Creating Scanner class
		Scanner input =new Scanner(System.in);

        //Taking input in unit price:
        System.out.println("Enter the unit price of a product");
        double unitPrice=input.nextDouble();

        //Taking input in quantity:
        System.out.println("Enter the quantity of product");
        int quantity =input.nextInt();

        //calculating total Price
        double totalPrice= unitPrice * quantity;

        //displaying the total price
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " 
		+ quantity + " and unit price is INR " + unitPrice); 

        input.close();
	}
}
import java.util.Scanner;

public class Fees_Discount_Input_09{

	public static void main(String[] args){
		
        Scanner input =new Scanner(System.in);
		

        //Taking input in the fees variable:
		System.out.println("Enter the fees : ");
		double fee = input.nextDouble();
		
        //Taking input in discount Percentage variable:
		System.out.println("Enter the discount percentage : ");
		double discountPercentage = input.nextDouble();
		
        //calculating discounted amount:
		double discountAmount = fee / discountPercentage;
		
        //calculating discounted price:
		double discountedPrice = fee - discountAmount;
		
        //printing discount amount and discount price
		System.out.println("The discount amount is INR " + discountAmount + 
		" and the final discounted fee is INR " + discountedPrice);

        input.close();
	}
}
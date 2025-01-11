//04. Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 

import java.lang.*;

class Profit_And_Loss_04{
	public static void main(String[] args){
		
	     // Given cost price and selling price :
	     int costPrice=129, sellingPrice=191;
		
	     // Calculating profit :
	     int profit = sellingPrice-costPrice;
		
	     // Calculating profit percentage :
	     double profitPercentage = (double)profit/(double)costPrice*100;
		
	     // Printing the cost and selling price with their profit and profit percentage :
             System.out.print("The Cost Price is INR "+ costPrice + " and Selling Price is INR " 
             + sellingPrice + "\nThe Profit is INR "+ profit + " and the Profit Percentage is "
             + profitPercentage );
	}
}	
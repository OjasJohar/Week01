//The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%.
//Write a program to find the discounted amount and discounted price the student will pay for the course.

import java.lang.*;

class Discounted_Amount_06{
	
	public static void main(String[] args){
		
		//Given fee amount and discount percentage:
		int fee = 125000, discountPercent=10;
		
		//Calculating the discounted amount:
		int discountedAmount = fee / discountPercent;
		
		//Calculating the discounted price:
		int discountedPrice = fee - discountedAmount;
		
		System.out.print("The discount amount is INR "+ discountedAmount +
		" and final discounted fee is INR "+ discountedPrice);
	}
}	
//02. Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM

import java.lang.*;

public class AveragePercentMark_02{
	
	public static void main(String[] args){

                //Sam's marks in Maths, Physics and Chemistry :
		int maths=94, physics=95, chemistry=96;
		
		//Average percent mark in PCM :
                double average = (maths + physics + chemistry)/3;
		
		//Printing the Average :
                System.out.print("Sam's average mark in PCM is "+ average);
	}
}	
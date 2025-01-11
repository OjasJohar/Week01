//01. Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024.

import java.lang.*;

class AgeOfHarry_01{
	
     public static void main(String[] args){
         
        // Harry's birth year=2000 and current year=2024.
	int harryBirthYear=2000, currentYear=2024;
        
        //Calculating harry's present age in 2024 :
	int harryAge=currentYear-harryBirthYear;
	
	//Printing Harry's age in 2024 :
        System.out.print("Harry's age in 2024 is " + harryAge + " years");

     }
}
	
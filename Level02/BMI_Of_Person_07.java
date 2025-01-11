// Calculating BMI of a Person

import java.util.Scanner;

public class BMI_Of_Person_07{

	public static void main(String[]args){

		//Creating Scanner class
		Scanner input = new Scanner(System.in);
		
		//Taking the weight input
		System.out.println("Enter the weight");
		double weight = input.nextDouble();
		
		//Taking the height input
		System.out.println("Enter the height");
		double height = input.nextDouble();
		
		//Converting height from cm to m
		double heightinM =height/100;
		
		//calulating BMI using weight and height
		double bmi = weight/(heightinM * heightinM);
		
		//Determining the weight status of the person based on the BMI
		if(bmi <= 18.4){
			System.out.println("The Person is Underweight");
		}
		else if(bmi > 18.4 && bmi <= 24.9){
			System.out.println("The Person is Normal");
		}
		else if(bmi > 24.9 && bmi <= 39.9){
			System.out.println("The Person is Overweight");
		}
		else if(bmi >= 40.0){
			System.out.println("The Person is Obese");
		}

        input.close();
	}
}
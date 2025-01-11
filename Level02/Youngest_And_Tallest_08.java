// Finding the youngest and tallest friend among three friend

import java.util.Scanner;

public class Youngest_And_Tallest_08{

	public static void main(String[]args){

		//creating Scanner class
		Scanner sc = new Scanner(System.in);
		
		//Taking the input ages of all three friends
		System.out.println("Enter the ages of all three friend");
		
		System.out.println("Enter the ages of first friend");
		int a = sc.nextInt();
		 
		System.out.println("Enter the ages of second friend");
		int b = sc.nextInt();
		 
		System.out.println("Enter the ages of Third friend");
		int c = sc.nextInt();
		 
		//Calculating the youngest
		if(a < b && a<c){
			System.out.println("The Youngest friend is the first friend");
		}
		else if( b<a && b<c){
			System.out.println("The Youngest friend is the second friend");
		}
		else{
			System.out.println("The Youngest friend is the Third friend");
		}
		 
		 
		//Taking the height of the friends
		System.out.println("Enter the heights of all the three friend");
		
		System.out.println("Enter the height of first friend");
		double heightA = sc.nextDouble();
		
		System.out.println("Enter the height of second friend");
		double heightB = sc.nextDouble();
		
		System.out.println("Enter the height of Third friend");
		double heightC = sc.nextDouble();
		
		//Calculating the Tallest among them
		
		if(heightA > heightB && heightA > heightC){
			System.out.println("The Tallest friend is the first friend");
		}
		else if(heightB > heightA && heightB > heightC){
			System.out.println("The Tallest friend is the second friend");
		}
		else{
			System.out.println("The Tallest friend is the Third friend");
		}

		sc.close();
		
	}
}
import java.util.Scanner;

public class basicCalculator9{
	
	public static void addition(int num1, int num2){
		System.out.println("First number : " + num1);
		System.out.println("First number : " + num2);
		System.out.println("Addition     : " + (num1+num2));
	}
	
	public static void substraction(int num1, int num2){
		System.out.println("First number : " + num1);
		System.out.println("First number : " + num2);
		System.out.println("Substraction : " + (num1-num2));
	}
	
	public static void multiplication(int num1, int num2){
		System.out.println("First number  : " + num1);
		System.out.println("First number  : " + num2);
		System.out.println("Multiplication: " + (num1*num2));
	}
	
	public static void division(int num1, int num2){
		try{
			System.out.println("First number: " + num1);
		    System.out.println("First number: " + num2);
		    System.out.println("Division    : " + (num1/num2));
		}catch(Exception e){
			System.out.println("Division    : Infinity" );
		}
		
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner (System.in);
		
		//taking input from the user
		System.out.println("Enter the first number:");
		int num1=scanner.nextInt();
		
		//taking input from the user
		System.out.println("Enter the second number:");
		int num2 =scanner.nextInt();
		
		//taking input from the user
		System.out.println("Enter which operation you want to perform : (+, - ,* ,/)");
		char op=scanner.next().charAt(0);
		
		switch(op){
			case '+' :
			 addition(num1,num2);
			 break;
		    
			case '-' :
			 substraction(num1,num2);
			 break;
			 
			case '*' :
			 multiplication(num1,num2);
			 break;
			 
			case '/' :
			 division(num1,num2);
			 break;
			 
			default :
			  System.out.println("Invalid Input");
			  break;
		}
	}
}
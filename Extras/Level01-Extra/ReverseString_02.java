import java.util.Scanner;

public class ReverseString_02{
	
	public static void main(String[] args){
		
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Take user input
		System.out.println("Enter the String : ");
		String string=input.nextLine();
		
		String reverseString="";
		
		for(int i=string.length()-1;i>=0;i--){
			reverseString += string.charAt(i);
		}
		//Printing the result
		System.out.println("Reversed String : "+ reverseString);
		
		//Closing Scanner class
		input.close();
	}
}
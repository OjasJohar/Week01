import java.util.Scanner;

public class PalindromeChecker_05{
	
	//method to take input
	public static String takingInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input=scanner.nextLine();
		scanner.close();
		
		return input;
	}
	
	//method to check whether a String is palindrome is not
	public static boolean checkingPalindrome(String input){
		int start=0;
		int end=input.length()-1;
		
		while(start<end){
			char a=input.charAt(start);
			char b=input.charAt(end);
			if(a!=b){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

    public static void main(String[] args){
		
		//taking input 
		String input=takingInput();
		
		//checking for palindrome
		boolean isPalindrome = checkingPalindrome(input);
		
		//printing the output
		if(isPalindrome==true){
			System.out.println("The string " + input + " is a Palindrome.");
		}else{
		    System.out.println("The string " + input + " is not a Palindrome.");
		}
	} 
	
}
import java.util.Scanner;

public class PalindromeStringCheck_03{
	
	public static void main(String[] args){
		
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking user input
		System.out.println("Enter the String : ");
		String str=input.nextLine();
		
		//Attributes
		int startIndex=0;
		int endIndex=str.length()-1;
		boolean result=true;
		
	    while(startIndex<=endIndex){
			if(str.charAt(startIndex)!=str.charAt(endIndex))
				result=false;
			startIndex++;
			endIndex--;
		}
		//Printing result
		if(result==true){
			System.out.println(str +" is a Palindrome String .");
		}else
			System.out.println(str +" is not a Palindrome String .");
		
		//Closing Scanner class
		input.close();
	}
}
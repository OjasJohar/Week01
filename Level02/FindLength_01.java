import java.util.Scanner;

public class FindLength_01{
	
	public static int findLength(String string){
		//Method to find length of String
		int count=0;
		int temp=0;
		try{
			while(true){
			    temp=string.charAt(count);
				count++;
			}
		}catch(Exception e){
			//break;
		}
		return count;
	}
	
	public static void main(String[] args){
		
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking user input
		System.out.println("Enter the String :");
		String string=input.next();
		
		//Calling user-defined method
		int lengthOfString=FindLength_01.findLength(string);
		
		//Calling built-in method
		int lengthOfString1=string.length();
		
		//Printing the result:
		System.out.println("String's length from User-defined method : "+lengthOfString);
		System.out.println("String's length from Built-in length() method : "+lengthOfString);
		
		if(lengthOfString==lengthOfString1)
			System.out.println("Both lengths are Same. ");
		else
			System.out.println("Both lengths are not Same. ");
		
		//Closing Scanner class
		input.close();
	}
}
import java.util.Scanner;

public class RemoveSpecificCharacter_10{
	
	public static void main(String[] args){
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter the String : ");
		String string=input.nextLine();
		//Taking user input
		System.out.print("Enter the character to remove : ");
		char c=input.next().charAt(0);
		
		String result="";
		for(int i=0;i<string.length();i++){
			if(string.charAt(i)!=c){
				result += string.charAt(i);
			}
		}
		//Printing the result
		System.out.println("Modified String : "+result);
		//Closing Scanner class
		input.close();
	}
}
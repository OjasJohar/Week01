import java.util.Scanner;

public class CompareTwoStrings_01 {
	
	//Method to compare two strings:
	public static boolean compareTwoStrings(String string1, String string2){
			if(string1.length() == string2.length()){
				for(int i=0;i<string1.length();i++){
					if(string1.charAt(i)!= string2.charAt(i))
						return false;
				}
				return true;
			}else
			return false;	
	}
	
	public static void main(String[] args){	
		
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking user input:
		System.out.println("Enter the first String :");
		String string1=input.next();
		System.out.println("Enter the second String :");
		String string2=input.next();
		
		//Calling method:
		boolean result=CompareTwoStrings_01.compareTwoStrings(string1, string2);
		
		//Checking result:
		boolean checkResult=string1.equals(string2);
		
		//Printing the result
		if(result==checkResult && result ==true){
				System.out.print("String 1 : "+ string1);
				System.out.println("  String 2 : "+ string2);
			    System.out.println("The Strings are same and result is "+ result);	
		}else{
			System.out.print("String 1 : "+ string1);
			System.out.println("  String 2 : "+ string2);
		    System.out.println("The Strings are not same and result is "+ result);
		}
		//Closing Scanner class
		input.close();
	}
}
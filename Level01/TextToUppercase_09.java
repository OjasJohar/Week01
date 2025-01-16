import java.util.Scanner;

public class TextToUppercase_09{
	
	public static String toUpperCase(String string){
		//Method to convert LowerCase String into UpperCase
		String upperCase = "";
		for(int i=0;i<string.length();i++){
			int ascii=0;
			if(string.charAt(i)== ' '){
				upperCase += ' ';
			}
			else{
				ascii=string.charAt(i);
				if(ascii<97){
					upperCase += string.charAt(i);
				}else{
					upperCase += (char)(ascii-32);
				}
			}
		}
		return upperCase;
	}
	
	public static boolean compareStrings(String upperCase, String upperCase1){
		//Method to compare two strings
		if(upperCase.length()==upperCase1.length()){
			for(int i=0;i<upperCase.length();i++){
				if(upperCase.charAt(i)!=upperCase1.charAt(i)){
					return false;
				}else{
					return true;
				}
			}
		} 
		return false;
	}
	
	public static void main(String[] args){
		
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking user input
		System.out.println("Enter the LowerCase input : ");
		String string=input.nextLine();
		
		String upperCase=TextToUppercase_09.toUpperCase(string);
		String upperCase1=string.toUpperCase();
		
		System.out.println(string +" in UpperCase is "+ upperCase);
		System.out.println("Result String from both methods are: "+ upperCase + " and "
		+ upperCase1);
		
		boolean result=TextToUppercase_09.compareStrings(upperCase, upperCase1);
		
		//Printing the result
		if(result==true)
		    System.out.println("Both Strings are same. ");
		else
		    System.out.println("Both Strings are not same. ");
		
		//Closing the Scanner class
		input.close();
	}
}
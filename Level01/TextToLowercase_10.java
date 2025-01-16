import java.util.Scanner;

public class TextToLowercase_10{
	
	public static String toLowerCase(String string){
		//Method to convert upperCase String into LowerCase
		String lowerCase = "";
		for(int i=0;i<string.length();i++){
			int ascii=0;
			if(string.charAt(i)== ' '){
				lowerCase += ' ';
			}
			else{
				ascii=string.charAt(i);
				if(ascii>=97){
					lowerCase += string.charAt(i);
				}else if(ascii>64){
					lowerCase += (char)(ascii+32);
				}else{
					lowerCase += string.charAt(i);
				}
			}
		}
		return lowerCase;
	}
	
	public static boolean compareStrings(String lowerCase, String lowerCase1){
		//Method to compare two strings
		if(lowerCase.length()==lowerCase1.length()){
			for(int i=0;i<lowerCase.length();i++){
				if(lowerCase.charAt(i)!=lowerCase1.charAt(i)){
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
		System.out.println("Enter the UpperCase input : ");
		String string=input.nextLine();
		
		String lowerCase=TextToLowercase_10.toLowerCase(string);
		String lowerCase1=string.toLowerCase();
		
		System.out.println(string +" in LowerCase is "+ lowerCase);
		System.out.println("Result String from both methods are: "+ lowerCase + " and "
		+ lowerCase1);
		
		boolean result=TextToLowercase_10.compareStrings(lowerCase, lowerCase1);
		
		//Printing the result
		if(result==true)
		    System.out.println("Both Strings are same. ");
		else
		    System.out.println("Both Strings are not same. ");
		
		//Closing the Scanner class
		input.close();
	}
}
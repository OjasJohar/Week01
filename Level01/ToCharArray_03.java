import java.util.Scanner;

public class ToCharArray_03{
	
	//Method to return the characters in an array:
	public static char[] charsToArray(String string){
		char[] temp=new char[string.length()];
		for(int i=0;i<string.length();i++){
			temp[i]=string.charAt(i);
		}
		return temp;
	}
	
	//Method to compare two char arrays and return a boolean result:
	public static boolean compareArrays(char[] charArray1, char[] charArray2){
		while(charArray1.length==charArray2.length){
			for(int i=0;i<charArray1.length;i++){
				if(charArray1[i]!=charArray2[i])
					return false;
			}
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking input String from user
		System.out.println("Enter the input String: ");
		String string=input.next();
		
		//Calling Method:
		char[] charArray1=ToCharArray_03.charsToArray(string);
		
		char[] charArray2=string.toCharArray();
		
		//Method for result:
		boolean result=ToCharArray_03.compareArrays(charArray1, charArray2);
		
		System.out.print("Chars on Array 1 : ");
		for(char chars : charArray1){
			System.out.print(chars+ " ");
		}
		System.out.print("\nChars on Array 2 : ");
		for(char chars1 : charArray2){
			System.out.print(chars1+ " ");
		}
		
		//Printing results:
		if(result==true){
			System.out.println("\nThese Char arrays are same");
		}else
			System.out.println("\nThese Char arrays are not same");
		
		//Closing Scanner class
		input.close();
	}
}
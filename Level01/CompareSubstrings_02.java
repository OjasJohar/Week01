import java.util.Scanner;

public class CompareSubstrings_02{
	
	public static String createSubstring(String string, int startIndex, int endIndex){
		//Creating sub string:
		String string2="";
		for(int i=startIndex;i<endIndex;i++){
			string2 = string2+ string.charAt(i);
		}
		return string2;
	}
	public static boolean compareSubstring(String subString, String subString2){
		//Comparing sub strings:
		if(subString.length()==subString2.length()){
		    for(int i=0;i<subString.length();i++){
				if(subString.charAt(i)!=subString2.charAt(i))
					return false;
			}
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		
		//Creating Scanner object:
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the String :");
		String string=input.next();
		int startIndex,endIndex;
		
		while(true){
			//Taking index values:
			System.out.println("Enter the start index :");
			startIndex=input.nextInt();
			System.out.println("Enter the end index :");
			endIndex=input.nextInt();
			
			if(endIndex>0 && startIndex<endIndex && endIndex<string.length())
				break;
			System.out.println("Invalid input, Try again!");
		}
		//Calling method:
		String subString=CompareSubstrings_02.createSubstring(string, startIndex, endIndex);
		
		//Creating substring:
		String subString2=string.substring(startIndex, endIndex);
		
		boolean result=CompareSubstrings_02.compareSubstring(subString, subString2);
		
		//Printing result:
		if(result==true){
			System.out.println("The Substrings are equal and result is true. ");
		}else
			System.out.println("The Substrings are not equal and result is false. ");
		
		//Closing Scanner class
		input.close();
	}
}
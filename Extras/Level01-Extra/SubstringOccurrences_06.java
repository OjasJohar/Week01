import java.util.Scanner;

public class SubstringOccurrences_06{
	
	public static void main(String[] args){
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking user input
		System.out.println("Enter the String : ");
		String string=input.nextLine();
		
		//Taking user input
		System.out.println("Enter the Substring : ");
		String substr=input.nextLine();
		
		int count=0;
		boolean fl=false;
		for(int i=0;i<string.length();i++){
			if(string.charAt(i)==substr.charAt(0)){
				for(int j=0;j<substr.length();j++){
					if(string.charAt(i+j)!=substr.charAt(j)){
						fl=false;
						break;
					}else
						fl=true;
				}
				if(fl==true)
					count++;
			}
		}
		//Printing the result:
		System.out.println(count+" times the given "+substr+" substring occurs in the string.");
		
		//Closing Scanner class
		input.close();
	}
}
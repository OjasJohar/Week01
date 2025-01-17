import java.util.Scanner;

public class MostFrequentCharacter_09{
	
	public static void main(String[] args){
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter the String : ");
		String str=input.next();
		
		char[] frequency=new char[255];
		
		char c;
		for(int i=0;i<str.length();i++){
			c=str.charAt(i);
			frequency[c]++;
		}
		
		char x='0';
		int l=0;
		for(int j=0;j<255;j++){
			if(frequency[j]>=l){
				x=(char)(j);
				l=frequency[j];
			}
		}
		System.out.println("Most Frequent Character: " + x);
		
		//Closing Scanner class
		input.close();
	}
}
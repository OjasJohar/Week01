import java.util.Scanner;

public class CountVowelsAndConsonants_01{
	
	public static void main(String[] args){
		
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Take user input
		System.out.println("Enter the String :");
		String string=input.nextLine();
		string=string.toUpperCase();
		//Attributes
		int vowelCount=0;
		int consonants=0;
		
		for(int i=0;i<string.length();i++){
			char c=string.charAt(i);
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
				vowelCount++;
			else if(c>='A'&&c<='Z')
				consonants++;
		}
		//Printing result:
		System.out.println("Number of vowels in String : "+ vowelCount);
		System.out.println("Number of consonants in String : "+ consonants);
		
		//Closing Scanner class
		input.close();
	}
}
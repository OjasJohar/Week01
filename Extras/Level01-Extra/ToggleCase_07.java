import java.util.Scanner;

public class ToggleCase_07{
	
	public static void main(String[] args){
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		//Take user input
		System.out.print("Enter the String : ");
		String str=input.nextLine();
		
		String result="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='a' && str.charAt(i)<='z'){
				char c=str.charAt(i);
				result += (char)(c-32);
			}else if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
				char c=str.charAt(i);
				result += (char)(c+32);
			}else{
				result += str.charAt(i);
			}				
		}
		//Printing result:
		System.out.print("Toggle Case Result : "+ result);
		//Closing Scanner class
		input.close();
	}
}
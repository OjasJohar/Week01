import java.util.Scanner;

public class RemoveDuplicates_04{
	
	public static void main(String[] args){
		
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking user input:
		System.out.println("Enter the String : ");
		String string=input.nextLine();
		
		char[] frequrency=new char[255];
		//Attributes
		char temp;
		String result="";
		
		for(int i=0;i<string.length();i++){
			frequrency[string.charAt(i)]++;
		}
		for(int j=0;j<string.length();j++){
			temp=string.charAt(j);
			if(frequrency[temp]>0){
				result += string.charAt(j);
				frequrency[string.charAt(j)]=0;
			}
		}
		//Printing the result:
		System.out.println("The result : "+result);
		
		//Closing Scanner class
		input.close();
	}
}
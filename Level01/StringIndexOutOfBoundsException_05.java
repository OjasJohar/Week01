import java.util.Scanner;

public class StringIndexOutOfBoundsException_05{
	
	//Generation of StringIndexOutOfBoundsException.
	public static void toGenerateException(String string){
		try{
			//Throws StringIndexOutOfBoundsException 
			char ch = string.charAt(20); 
            System.out.println(ch);
		}
		catch(Exception error){
			System.out.println("-> Exception Generated : ");
		    error.printStackTrace();
		}
    }
	//Method to handle the RuntimeException  
	public static void tohandleException(String string){
		try{
			//Throws StringIndexOutOfBoundsException 
			char ch = string.charAt(20); 
            System.out.println(ch);
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("-> NullPointerException caught :");
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args){
		
		//Creating Scanner object
		Scanner input= new Scanner(System.in);
		
		//Taking input from user
		System.out.println("Enter the String of length less then 20 : ");
		String string=input.next();
		while(true){
			if(string.length()<20)
				break;
			else{
				System.out.println("Enter correct String of length less then 20 : ");
				string=input.next();
			}	
		}
		
		System.out.println("1. Generating Exception ");
		toGenerateException(string);
		
		System.out.println("2. Calling method to handle Exception ");
		tohandleException(string);
		
		//Closing Scanner class
		input.close();
	}
}
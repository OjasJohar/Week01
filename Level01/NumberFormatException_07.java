import java.util.Scanner;

public class NumberformatException_07{
	
	//Method to generate exception
	public static void generatingException(String string){
		int num;
	    try{
		   string=string + 'a';
		   num=Integer.parseInt(string);	 
		}catch(NumberFormatException e){
		   e.printStackTrace();
		}
	}
	
	//Method to handle exception using try catch 
	public static void handlingException(String string){
		int num;
		try{
			string=string + 'a';
	     	num=Integer.parseInt(string);	 
		}catch(NumberFormatException e){
			System.out.println("Number format Exception caught => " + e.getMessage() );
			System.out.println(e.toString());
		}
	}
	
    public static void main(String[] args){
	  
	    //Creating Scanner object
		Scanner input=new Scanner(System.in);
	 
	    //taking input from the user
	    System.out.println("Enter the Number :");
	    String string=input.next();
	 
        //calling generate exception method
	    System.out.println("1. Calling method to generate NumberFormatException: ");
        generatingException(string);
	 
	    //calling method to handle exception
	    System.out.println("2. Calling method to handle NumberFormatException: ");
	    handlingException(string);
	 
	    //Closing Scanner class
	    input.close(); 
    }
}
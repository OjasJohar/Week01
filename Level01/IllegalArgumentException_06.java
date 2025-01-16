//An IllegalArgumentException is thrown when an argument passed to a method doesn't fit within 
//the logic of the usage of the argument.
//ex-> age = -1;

import java.util.Scanner;

public class IllegalArgumentException_06{
	
	//Method to generate exception
	public static String generatingException(String string){
		
		String sub="";
	    try{
		   //generating the IllegalArgument Exception
		   int endIndex=string.length()-1;
		   int startIndex=endIndex+20;
		   sub=string.substring(startIndex,endIndex+1);	
		}catch(Exception e){
		   throw new IllegalArgumentException("Invalid argument");
		}
		return sub;
	}
	
	//Method to handle exception using try catch 
	public static String handlingException(String s){
		
		String sub="";
		try{
		//generating the IllegalArgument Exception
		   int endIndex=s.length()-1;
		   int startIndex=endIndex+20;
		   sub=s.substring(startIndex,endIndex+1);
		}catch(Exception e){
			throw new IllegalArgumentException("Invalid argument");
		}
		return sub;
	}
	
    public static void main(String[] args){
	  
	    //Creating Scanner object
		Scanner input=new Scanner(System.in);
	 
	    //Taking input from the user
	    System.out.println("Enter the String :");
	    String string=input.next();
	 
        //Calling generate exception method:
	    try{
		    System.out.println("1. Calling method to generate IllegalArgumentException: ");
            generatingException(string);  
	    }catch(Exception e){
		    e.printStackTrace(); 
	    }
	 
	    //Calling method to handle exception
	    try{
	        System.out.println("2. Calling method to handle IllegalArgumentException: ");
	        handlingException(string);
	    }catch(Exception e){
		    System.out.println("Illegal Argument Exception caught  => " + e.getMessage() ); 
	    }
	 
	    //Closing Scanner class
		input.close();
    }
}
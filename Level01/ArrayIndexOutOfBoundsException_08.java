import java.util.Scanner;

public class ArrayIndexOutOfBoundsException_08{
	
	//Method to generate exception
	public static void generatingException(String[] name){
	    try{
			System.out.println("Printing the name of students..");
			for(int i=0;i<5;i++){
				System.out.println(name[6]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
		   e.printStackTrace();
		}
	}
	
	//Method to handle exception using try catch 
	public static void handlingException(String[] name){
		try{
			System.out.println("Printing the name of students..");
			for(int i=0;i<5;i++){
				System.out.println(name[6]);
			}	 
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Out Of Bound Exception caught => " + e.getMessage() );
		}
	}
	
    public static void main(String[] args){
	  
	    //Creating Scanner object
		Scanner input=new Scanner(System.in);
	 
	    String[] name=new String[5];
	 
	    //Taking input from the user
	    for(int i=0;i<5;i++){
	       System.out.println("Enter the Name of person " + (i+1) + " :");
	       name[i]=input.next();
	    }
	 
        //Calling generate exception method
	    System.out.println("1. Calling method to generate ArrayIndexOutOfBoundException : ");
        generatingException(name);
	 
	    //calling method to handle exception
	    System.out.println("2. Calling method to handle ArrayIndexOutOfBoundException : ");
	    handlingException(name);
	 
	    //Closing Scanner class
		input.close(); 
    }
}
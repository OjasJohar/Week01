public class DemonstrateNullPointerException_04{
	
	//Generation of NullPointerException in Java
	public static void toGenerateException(){
		//Method to generate exception:
		
		//Declaring a variable and initializing it NULL 
		String text=null;
	    System.out.println("Length of String is: " );
		//Calling built-in methods in this null variable to generate exception
        System.out.println(text.length()); 
		//The string reference “text” is null. 
		//When the program tries to call the length() method,
        //it throws a NullPointerException because there is no actual object.
    }
	
	//Method to handle the RuntimeException
	public static void tohandleNullPointerException(){
		try{
			String text=null;
			System.out.println(text.length());
		}catch(NullPointerException e){
			System.out.println("-> NullPointerException caught :");
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args){
		
	    try{
		    System.out.println("1. Generating Exception ");
		    toGenerateException();
		}catch(NullPointerException e){
		    e.printStackTrace();
		}	
		System.out.println("2. Calling Method to handle NullPointerException ");
		tohandleNullPointerException();
	}
}
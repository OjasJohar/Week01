import java.util.Scanner;

public class NumberOfHandshakes_02{
	
	//method to calculate maximum number of handshakes
	public int numberOfHandshakes(int n){
		int maxHandshakes= (n * (n - 1)) / 2;
	    return maxHandshakes;
	}
	
	public static void main(String[] args){
		
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking user input in students variable
		System.out.println("Enter the number of students :");
		int numberOfStudents=input.nextInt();
		
		//calculating maximun number of Handshakes
		NumberOfHandshakes_02 obj=new NumberOfHandshakes_02();
		int handshakes=obj.numberOfHandshakes(numberOfStudents);
		
		//printing the result
		System.out.println("The maximun number of possible handshakes among " 
		+ numberOfStudents + " is " + handshakes + ".");
		
		//Closing the Scanner class
		input.close();
		
	}
}	
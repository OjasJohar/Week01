import java.util.Scanner;

public class MaxHandshakes_03{
	
	//Method to calculate maximum number of handshakes
	public int calculateHandshakes(int students){
		int maxH;
		maxH = (students * (students - 1)) /2;
		return maxH;	
	}
	
	public static void main(String[] args){
		
		//Creating Scanner object
		Scanner input = new Scanner(System.in);
		
		//Taking user input in students variable
		System.out.println("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		
		//calculating maximun number of Handshakes
		MaxHandshakes_03 obj=new MaxHandshakes_03();
		int handshakes=obj.calculateHandshakes(numberOfStudents);
		
		//printing the result
		System.out.println("The maximun number of possible handshakes among " 
		+ numberOfStudents + " is " + handshakes + ".");
		
		//Closing Scanner class
		input.close();
	}
	
}
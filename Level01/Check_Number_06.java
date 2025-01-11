import java.util.Scanner;

public class Check_Number_06{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		//Taking number from user:
		System.out.println("Enter the number :");
		int number= input.nextInt();
		
		//Checking if the number is zero, negative, or positive:
		if(number > 0){
			//Printing result:
			System.out.println("Positive");
		} else if (number < 0) {
			//Printing result:
            System.out.println("Negative");
		} else {
			//Printing result:
            System.out.println("Zero");
		}
       
        input.close();
    }
}	
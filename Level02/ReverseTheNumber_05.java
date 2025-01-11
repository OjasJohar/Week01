import java.util.Scanner;

public class ReverseTheNumber_05 {
	
	public static void main(String[] args){
		
		//Creating Scanner object
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter the number :");
		//Take user input
		int number=input.nextInt();
		
		int count=0;
		int index=0;
		int temp=number;
		
		//Counting the digits:
		while(temp>0){
			temp = temp/10;
			count++;
		}	                              
		
        //Array to store digits
		int[] digits=new int[count];
		
        while(number>0){
			int remainder=number % 10;
			//Inserting the digits in array:
			digits[index]=remainder;
			number=number/10;
			index++;
		}

		//Displaying the result:
		System.out.println("Printing the array in reverse order :");
		for(int x=0; x<digits.length; x++){
			System.out.print(digits[x] + " ");
			index--;
		}			
		
		//Closing the Scanner Stream 
        input.close();
	}
}	
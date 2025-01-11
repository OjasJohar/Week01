import java.util.Scanner;

public class LargestAndSecondLargestNumber_03 {
	
	public static void main(String[] args){
		
		//Creating Scanner object
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter the number ");
		//Take user input (number):
		long number= input.nextLong();
		
		//Define the maximum size of the array and an index to store the digits
		int maxDigit=10;
		int index;
		
		//Array to store digits
		long[] arr=new long[maxDigit];
			
		//Loop to extract digits from the number and store them in the array
		for(index=0; index<maxDigit; index++){
			if(number>0){
			  arr[index]=number%10;
			  number=number/10;
			} 
			else{
				break;
			}
		}
        
        //Variables to store the largest and second largest digit
		long largestNumber=0, secondLargestNumber=0;
		
		//Loop through the digits array to find the largest and second largest digits
		for(int j=0; j<arr.length; j++){
            if(largestNumber<arr[j]){
				largestNumber= arr[j];
			}
		}
        for(int q=0; q<arr.length; q++){
            if(arr[q]!= largestNumber){
				if(arr[q]>secondLargestNumber){
					secondLargestNumber=arr[q];
				}
			}
        }			
		
		//Output the largest and second largest digits
		System.out.println("Largest number : "+ largestNumber);
		System.out.println("Second largest number : "+ secondLargestNumber);
		
		//Closing the Scanner Stream 
		input.close();
	}
}	
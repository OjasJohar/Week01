import java.util.Scanner;

public class LargestAndSecondLargestNumber_04 {
	
	public static void main(String[] args){
		
		//Creating Scanner object
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter the number :");
		//Take user input (number):
		long number= input.nextLong();
		
		//Define the maximum size of the array and an index to store the digits
		int maxDigit=10;
		int index=0;
		
		//Array to store digits
		long[] arr=new long[maxDigit];
			
		//Loop to extract digits from the number and store them in the array
		while(true){
			if(number>0 && index<maxDigit){
			  arr[index]=number%10;
			  number=number/10;
			  index++;   
			} else if(index==maxDigit){
				//If the index reaches maxDigits, we need to increase the size of the array
				maxDigit += 10;
				long[] temp = new long[maxDigit];
				for(int x=0; x<index; x++){
					temp[x]=arr[x];
				}
				//now we are assigning temp array to our arr array.
				arr=temp;
			} else{
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
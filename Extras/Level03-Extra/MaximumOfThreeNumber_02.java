import java.util.Scanner;

//creating class
public class MaximumOfThreeNumber_02{
	
	//method to take input from the user
	public static int[] takingInput(){
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the first Number.");
		int first=scanner.nextInt();
		
		System.out.println("Enter the second Number.");
		int second=scanner.nextInt();
		
		System.out.println("Enter the third Number.");
		int third=scanner.nextInt();
		
		scanner.close();
		
		return new int[]{first, second, third};	
	}
	
	public  static int findingmax(int[] arr){
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=max){
				max=arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args){

        //declaring three variables;
		int number[]=new int[3];
		
		number=takingInput();
		
		int maxNumber=findingmax(number);
		
        //displaying the result
        System.out.println("The maximun number is: " + maxNumber);		
	}
}
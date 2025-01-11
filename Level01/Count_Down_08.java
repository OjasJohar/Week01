import java.util.Scanner;

public class Count_Down_08{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		//Taking input from user:
		System.out.println("Enter the count down number");
		int counter= input.nextInt();
		
		if (counter>0){
			//Using while loop:
			while(counter>0){
                //Printing output:
				System.out.println(counter + "...");
                counter--;
			}
		}else {
            // Printing error:
			System.out.println("Counter is not a natural number");
		}
         
        input.close();
	}
}	
	
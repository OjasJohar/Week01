import java.util.Scanner;

public class Abundant_Number_04 {
	
    public static void main(String[] args) {

        //Creating Scanner class
		Scanner input = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        //defining sum variable 
        int sum=0;

        //calculating abundant number using while loop
        for(int i=1;i<number;i++){
            if(number % i==0){
               sum=sum + i;       
            }
        }

        //printing the output
        if(sum> number){
            System.out.println("It's an Abundant number");
        }else{
            System.out.println("It's not an Abundant number");
        }

        input.close();
    }
}
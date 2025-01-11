import java.util.Scanner;

public class FizzBuzz_10 {
	
    public static void main(String[] args) {

        //Creating Scanner object
		Scanner input = new Scanner(System.in);

        //taking input from the user
        System.out.println("Enter the number: ");
        int number= input.nextInt();

        //declaring the array
        String fizz[] =new String[number+1];

        //finding the buzz, fizz and fizzBuzz
        for(int i=0;i<=number;i++){
          if(i%3==0 && i%5==0){
            fizz[i]="FizzBuzz";
          }
          else if(i%3==0){
            fizz[i]="Fizz";
          }
          else if(i%5==0){
            fizz[i]="Buzz";
          }
          else{
            fizz[i]=""+i;
          }
        }

         //displaying the result
         for(int i=0;i<number;i++){
           System.out.println("Position " + (i+1) + " = " + fizz[i+1]);
         }
     
        input.close();
    }
}
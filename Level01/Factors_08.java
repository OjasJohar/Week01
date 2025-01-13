import java.util.Scanner;

public class Factors_08 {
	
    public static void main(String[] args) {

       //Creating Scanner object
	   Scanner input = new Scanner(System.in);

       //taking input from the user
       System.out.println("Enter the number: ");
       int number = input.nextInt();

      //declaring index variable
      int maxFactor=10;
      int index=0;
 
      //declaring array 
      int factor[]= new int[maxFactor];

        for(int i=1;i<=number;i++){
            if(number % i ==0){
                if(index == maxFactor){
                    maxFactor= 2 * maxFactor;
                    int temp[]= new int[maxFactor];
                    for(int j=0;j<index;j++){
                        temp[j]=factor[j];
                    }
                    factor=temp;
                }
                factor[index] = i;
                index++;
            }
        }
       
        //displaying the result
        System.out.println("The factors of number " + number + " are: ");
        for(int i=0;i<index;i++){
          System.out.print(factor[i] + " ");
        }

       input.close();
    }
}
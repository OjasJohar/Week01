import java.util.Scanner;

public class MeanHeight_06 {
	
    public static void main(String[] args) {

       //Creating Scanner object
	   Scanner input = new Scanner(System.in);

       //Declaring an array of size 11
       double heights[]= new double[11];

       //declaring a variable named total to store the total sum of all values
       double total = 0;

       //Taking input from user:
       for(int i=0;i<11;i++){
          System.out.println("Enter the height of player " + (i+1));
          heights[i]=input.nextDouble();
       }

       //calculating total sum of height
       for(int i=0;i<11;i++){
          total = total + heights[i];
       }

       //calculating the mean height of a team
       double meanHeight = total / 11;
       
       //displaying the result
       System.out.println("The mean height of 11 players is " + meanHeight);
   
       input.close();
    }
}
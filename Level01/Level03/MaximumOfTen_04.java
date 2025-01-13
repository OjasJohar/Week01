import java.util.Scanner;

public class MaximumOfTen_04 {
	
    public static void main(String[] args) {

        //Creating Scanner object
		Scanner input = new Scanner(System.in);

       //declaring an array of size 10
       double number[]=new double[10];

       //declaring a variable named total to store the total sum of all values
        double total = 0;

       //declaring a variable to store the index number of array
       int index=0;

       //calculating the sum of values
       while(true){
           System.out.println("Enter the number: ");
           number[index]=input.nextDouble();
          
            //breaking the loop if the number is negative or zero
            if(number[index]<=0){
               break;
            }

           // adding value to total
           total = total + number[index];
           index++;


            //breaking the loop if the maximum size is reached
            if(index==10){
               break;
            }
        }
        
       //printing the total 
        for(int i=0;i<index;i++){
          System.out.println("The number " + i + " is " + number[i]);
        }
         System.out.println("The total sum of all the numbers is " + total + ".");
           
     
        input.close();
    }
}
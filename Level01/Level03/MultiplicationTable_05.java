import java.util.Scanner;

public class MultiplicationTable_05 {
	
    public static void main(String[] args) {

        //Creating Scanner object 
		Scanner input = new Scanner(System.in);

        //creating a variable named number;
        System.out.println("Enter the number :");
        int number = input.nextInt();

        //Declaring an array of size 10
        int table[]= new int[10];

        //checking whether the number entered by the user is between 6 to 9 or not.
        if(number<=9 && number>=6){
            //calculating the multiplication table.
            for(int i=0;i<10;i++){
              table[i]= number * (i+1);
            }

            //displaying the result
            for(int i=0;i<10;i++){
              System.out.println(number + " * " + (i+1) + " = " + table[i]);
            }
        }
        else{
            System.out.println("The entered number is not in the range from 6 to 9");
        }
  
        input.close();
    }
}
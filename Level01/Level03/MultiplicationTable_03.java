import java.util.Scanner;

public class  MultiplicationTable_03 {
	
    public static void main(String[] args) {

        //Creating Scanner object
		Scanner input = new Scanner(System.in);

        //creating a variable named number;
        System.out.println("Enter the number :");
        int number = input.nextInt();

        //declaring an array of size 10
        int table[]= new int[10];

        //calculating the table for given input number
        for(int i=0;i<10;i++){
           table[i] = number * (i+1); 
        }
        
        //printing the multiplication table 
        for(int i=0;i<10;i++){
           System.out.println(number + " * " + (i+1) + " = " + table[i]);
        }
     
        input.close();
    }
}
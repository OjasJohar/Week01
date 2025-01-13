import java.util.Scanner;

public class MultiDimensionalArrays_09 {
	
    public static void main(String[] args) {

        //Creating Scanner object
	    Scanner input = new Scanner(System.in);
        
        //taking input from the user
        System.out.println("Enter the row number :");
        int row = input.nextInt();

        //taking input from the user
        System.out.println("Enter the column number :");
        int column = input.nextInt();

        //declaring a two dimensional array
        int[][] multiArr=new int[row][column];

        //Taking input in multidimensional array
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
               System.out.println("Enter the element of row " + i + " and column " + j + " :");
               multiArr[i][j]=input.nextInt();
            }
        }

        //creating a one dimensional array
        int singleArr[]=new int[row * column];

        //copying elements from two dimensional array to single dimensional array
        int index=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
               singleArr[index]=multiArr[i][j];
               index++;
            }
        }

        //displaying the two dimensional array
        System.out.println("Elements in two dimensional array are:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
               System.out.print(multiArr[i][j] + " ");
            }
            System.out.println();
        }

        //displaying the single dimensional array
        System.out.println("\nElements in single dimensional array are:");
        for(int i=0;i<row*column;i++){
           System.out.print(singleArr[i] + " ");
        }
        
       input.close();
    }
}
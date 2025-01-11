import java.util.Scanner;

public class OddAndEven_07 {
	
    public static void main(String[] args) {

        //Creating Scanner object
		Scanner input = new Scanner(System.in);

        //Taking input from the user
        System.out.println("Enter the number: ");
        int number = input.nextInt();
  
        //creating two arrays even or odd 
        int size= number/2 +1 ;
      
        int even[] = new int[size];
        int odd[] = new int[size];
        
        //declaring index 
        int indexE=0;
        int indexO=0;

        //calculating the result
        for(int i=1;i<=number;i++){
            if(i%2==0){
                even[indexE]=i;
                indexE++;
            }
            else{
                odd[indexO]=i;
                indexO++;
            }
         }

        //printing the even array
        System.out.println("The even numbers are :");
        for(int i=0;i<indexE;i++){
           System.out.print(even[i] + " ");
        }

        //printing the odd array
        System.out.println("\nThe odd numbers are :");
        for(int i=0;i<indexO;i++){
           System.out.print(odd[i] + " ");
        }

       input.close();
    }
}
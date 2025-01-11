import java.util.Scanner;

public class Total_Income_Of_Person_06{
	
      public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        //Taking user input in salary variable:
        System.out.println("Enter the Salary");
        double salary = input.nextDouble();

        //Taking user input in bonus variable:
        System.out.println("Enter the bonus");
        double bonus = input.nextDouble();

        //Calculating the total income of user:
        double totalIncome = salary + bonus;

        //Printing the output
        System.out.println("The salary is INR " + salary + " and bonus is INR " 
		+ bonus + ". Hence Total Income is INR " + totalIncome + ".");

        input.close();
    }   
}
import java.util.Scanner;

public class Bonus_Of_Employees_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // taking input from the user
        System.out.println("Enter the salary of an employee:");
        double salary = input.nextDouble();

        // taking input from the user
        System.out.println("Enter the years of service:");
        double service = input.nextDouble();

        // calculating bonus amount
        double bonus = 0;
        if (service > 5) {
            bonus = salary * 5 / 100;
        }

        // printing the result
        System.out.println("The bonus received by the employed is " + bonus);

        input.close();
    }

}
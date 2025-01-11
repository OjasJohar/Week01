import java.util.Scanner;

public class BonusOfEmployees_01 {

    public static void main(String[] args) {

        //Creating Scanner object
		Scanner input = new Scanner(System.in);
        int numEmployees = 10;

        //Arrays to store salary, years of service, bonus, and new salary for each
        //employee:
        double[] salaries = new double[numEmployees];
        int[] yearsOfService = new int[numEmployees];
        double[] bonuses = new double[numEmployees];
        double[] newSalaries = new double[numEmployees];

        //Variables to calculate total bonus, old salary, and new salary
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        //Input loop for each employee:
        for(int i = 0; i < numEmployees; i++) {
            while (true) {

                System.out.print("Enter the salary for employee " + (i + 1) + ": ");
                double salary = input.nextDouble();
                if (salary <= 0) {
                    System.out.println("Salary must be a positive number. Please try again.");
                    continue;
                }

                System.out.print("Enter the years of service for employee " + (i + 1) + ": ");
                int years = input.nextInt();
                if (years < 0) {
                    System.out.println("Years of service must be a non-negative number. Please try again.");
                    continue;
                }

                // Store valid salary and years of service
                salaries[i] = salary;
                yearsOfService[i] = years;
                break;

            }

            double bonus;
            if (yearsOfService[i] > 5) {
                bonus = salaries[i] * 0.05; // 5% bonus for employees with more than 5 years of service
            } else {
                bonus = salaries[i] * 0.02; // 2% bonus for employees with 5 or fewer years of service
            }
            bonuses[i] = bonus;

            newSalaries[i] = bonus + salaries[i];

            //Updating total values:
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        //Output the results
        System.out.println("\nSummary of Employee Bonuses and Salaries:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee "+ (i+1) +" Old Salary = "+ salaries[i] + ", Bonus = " + bonuses[i] + ", New Salary = " + newSalaries[i]);
        }

        System.out.println("\nTotal Bonus Paid: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        input.close();
    }
}
import java.util.Random;

public class Bonus_11 {

    // Method to determine the salary and years of service for each employee
    public static double[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        double[][] employeeData = new double[numEmployees][2]; // 2D array for salary and years of service

        for (int i = 0; i < numEmployees; i++) {
            // Random salary between 10000 and 99999
            employeeData[i][0] = 10000 + (random.nextInt(90000));
            // Random years of service between 1 and 20
            employeeData[i][1] = 1 + random.nextInt(20);
        }
        return employeeData;
    }

    // Method to calculate new salary and bonus based on years of service
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3]; // 3 columns: old salary, new salary, bonus

        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double bonus;

            // Calculate bonus
            if (yearsOfService > 5) {
                bonus = salary * 0.05; // 5% bonus if service > 5 years
            } else {
                bonus = salary * 0.02; // 2% bonus if service <= 5 years
            }

            // Calculate new salary
            double newSalary = salary + bonus;

            // Store old salary, new salary, and bonus in updatedData array
            updatedData[i][0] = salary;
            updatedData[i][1] = newSalary;
            updatedData[i][2] = bonus;
        }
        return updatedData;
    }

    // Method to calculate the sum of old salary, new salary, and bonus
    public static double[] calculateTotalAmounts(double[][] updatedData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        for (int i = 0; i < updatedData.length; i++) {
            totalOldSalary += updatedData[i][0];
            totalNewSalary += updatedData[i][1];
            totalBonus += updatedData[i][2];
        }

        return new double[] { totalOldSalary, totalNewSalary, totalBonus };
    }

    // Method to display the employee details and totals in a tabular format using
    // println
public static void displayEmployeeDetails(double[][] updatedData, double[] totals) {
    // Printing the header for the table
    System.out.println("Employee # | Old Salary | New Salary | Bonus");
    System.out.println("----------------------------------------------------");
    
    // Loop through each employee's data and print the details in tabular format
    for (int i = 0; i < updatedData.length; i++) {
        // Printing each employee's details line by line
        System.out.println("Employee " + (i + 1) + " | " + updatedData[i][0] + " | " + updatedData[i][1] + " | " +  updatedData[i][2]);
    }
    
    // Display the totals section after the employee details
    System.out.println("----------------------------------------------------");
    // Printing the totals for old salary, new salary, and bonus
    System.out.println("Total     | " +  totals[0] + " | " +   totals[1]+ " | " +    totals[2]);
}

    public static void main(String[] args) {
        int numEmployees = 10; // Total number of employees

        // Generate the employee data
        double[][] employeeData = generateEmployeeData(numEmployees);

        // Calculate bonus and new salary
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);

        // Calculate total old salary, new salary, and bonus
        double[] totals = calculateTotalAmounts(updatedData);

        // Display the details in a tabular format
        displayEmployeeDetails(updatedData, totals);
    }
}
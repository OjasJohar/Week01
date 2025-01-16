import java.util.Scanner;

public class StudentVotingEligibility_08 {

    // Method to generate random ages for students
    public static int[] generateStudentAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            // Generate random age between 10 and 99 (2-digit number)
            ages[i] = 10 + (int)(Math.random() * 90);
        }
        return ages;
    }

    // Method to check voting eligibility based on age
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibility = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            if (age < 0) {
                eligibility[i][0] = String.valueOf(age);
                eligibility[i][1] = "Invalid Age";
            } else if (age >= 18) {
                eligibility[i][0] = String.valueOf(age);
                eligibility[i][1] = "Can Vote";
            } else {
                eligibility[i][0] = String.valueOf(age);
                eligibility[i][1] = "Cannot Vote";
            }
        }

        return eligibility;
    }
// Method to display the 2D array in a tabular format
public static void displayEligibility(String[][] eligibility) {
    System.out.println("Age   | Voting Eligibility");
    System.out.println("----------------------------");

    for (int i = 0; i < eligibility.length; i++) {
        // Manually format the output for alignment
        String age = eligibility[i][0];
        String eligibilityStatus = eligibility[i][1];

        // Display the age with fixed space padding for alignment
        System.out.print(age);
        // Adding spaces to align the second column (Voting Eligibility)
        int spaces = 6 - age.length();
        for (int j = 0; j < spaces; j++) {
            System.out.print(" ");  // Add spaces to align the eligibility column
        }

        // Print the eligibility status
        System.out.println("| " + eligibilityStatus);
    }
}


    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Number of students
        int numberOfStudents = 10;

        // Generate random ages for the students
        int[] ages = generateStudentAges(numberOfStudents);

        // Check voting eligibility based on ages
        String[][] eligibility = checkVotingEligibility(ages);

        // Display the result
        displayEligibility(eligibility);

        input.close();
    }
}
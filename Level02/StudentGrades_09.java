import java.util.Scanner;

public class StudentGrades_09 {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3]; // 2D array to store scores for each student in 3 subjects

        for (int i = 0; i < numberOfStudents; i++) {
            // Generate random marks between 10 and 99 for each subject
            scores[i][0] = 10 + (int) (Math.random() * 90); // Physics
            scores[i][1] = 10 + (int) (Math.random() * 90); // Chemistry
            scores[i][2] = 10 + (int) (Math.random() * 90); // Math
        }
        return scores;
    }

    // Method to calculate the total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores, int numberOfStudents) {
        double[][] results = new double[numberOfStudents][4]; // 2D array to store total, average, and percentage

        for (int i = 0; i < numberOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2]; // Total marks
            double average = total / 3.0; // Average marks
            double percentage = (total / 300.0) * 100; // Percentage (out of 100)

            // Round off to 2 decimal places
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    // Method to calculate the grade based on percentage
    public static String[][] calculateGrades(double[][] results, int numberOfStudents) {
        String[][] grades = new String[numberOfStudents][2]; // 2D array to store grade for each student

        for (int i = 0; i < numberOfStudents; i++) {
            double percentage = results[i][2];
            String grade;

            if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 70) {
                grade = "B";
            } else if (percentage >= 60) {
                grade = "C";
            } else if (percentage >= 50) {
                grade = "D";
            } else if (percentage >= 40) {
                grade = "E";
            } else {
                grade = "R";
            }

            grades[i][0] = "Student " + (i + 1);
            grades[i][1] = grade;
        }

        return grades;
    }

    // Method to display the scorecard of all students in a tabular format using
    // println()
    public static void displayScorecard(int[][] scores, double[][] results, String[][] grades, int numberOfStudents) {
        System.out.println("Scorecard:");
        System.out.println("------------------------------------------------------------");
        System.out.println("Student     Physics   Chemistry Math      Total      Average    Grade");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < numberOfStudents; i++) {
            // Manually format and print each student's information
            String studentName = "Student " + (i + 1);
            String physicsScore = String.valueOf(scores[i][0]);
            String chemistryScore = String.valueOf(scores[i][1]);
            String mathScore = String.valueOf(scores[i][2]);
            String totalScore = String.format("%.2f", results[i][0]);
            String averageScore = String.format("%.2f", results[i][1]);
            String grade = grades[i][1];

            // Print the student details using println() with proper spaces for alignment
            System.out.print(studentName);
            // Adding spaces to align the next column (Physics)
            for (int j = 0; j < 12 - studentName.length(); j++) {
                System.out.print(" ");
            }

            // Physics score column
            System.out.print(physicsScore);
            for (int j = 0; j < 10 - physicsScore.length(); j++) {
                System.out.print(" ");
            }

            // Chemistry score column
            System.out.print(chemistryScore);
            for (int j = 0; j < 10 - chemistryScore.length(); j++) {
                System.out.print(" ");
            }

            // Math score column
            System.out.print(mathScore);
            for (int j = 0; j < 10 - mathScore.length(); j++) {
                System.out.print(" ");
            }

            // Total score column
            System.out.print(totalScore);
            for (int j = 0; j < 10 - totalScore.length(); j++) {
                System.out.print(" ");
            }

            // Average score column
            System.out.print(averageScore);
            for (int j = 0; j < 10 - averageScore.length(); j++) {
                System.out.print(" ");
            }

            // Grade column
            System.out.println(grade);
        }

        System.out.println("------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        //taking input from the user
        System.out.println("Enter the number of students");
        int numberOfStudents = input.nextInt(); // Number of students in the class

        // Generate random scores for students in Physics, Chemistry, and Math
        int[][] scores = generateScores(numberOfStudents);

        // Calculate the total, average, and percentage for each student
        double[][] results = calculateResults(scores, numberOfStudents);

        // Calculate the grade for each student based on their percentage
        String[][] grades = calculateGrades(results, numberOfStudents);

        // Display the final scorecard
        displayScorecard(scores, results, grades, numberOfStudents);

        input.close();
    }
}
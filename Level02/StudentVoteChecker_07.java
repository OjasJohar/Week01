import java.util.Scanner;

public class StudentVoteChecker_07 {

    // Method to check if the student can vote based on age
    public boolean canStudentVote(int age) {
        // Validate the age (negative age should not be allowed)
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentVoteChecker_07 checker = new StudentVoteChecker_07();

        // Array to hold the ages of 10 students
        int[] studentAges = new int[10];

        // Take input for 10 students ages
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();
        }

        // Check if each student can vote and display the result
        for (int i = 0; i < 10; i++) {
            boolean canVote = checker.canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") cannot vote.");
            }
        }

        //Closing the Scanner class
        input.close();
    }
}
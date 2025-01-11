import java.util.Scanner;

public class YoungestFriend_02 {

    public static void main(String[] args) {
		
		//Creating Scanner object
        Scanner input = new Scanner(System.in);

        //Arrays to store age and height of the three friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        //Names of the friends for reference
        String[] friends = {"Amar", "Akbar", "Anthony"};

        //Input the age and height of each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + friends[i] + ": ");
            ages[i] = input.nextInt();

            System.out.print("Enter the height (in cm) of " + friends[i] + ": ");
            heights[i] = input.nextDouble();
        }

        // Find the youngest friend
        int youngestAge = ages[0];
        String youngestFriend = friends[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = friends[i];
            }
        }

        //Find the tallest friend
        double tallestHeight = heights[0];
        String tallestFriend = friends[0];
        for (int i = 1; i < 3; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = friends[i];
            }
        }

        //Display the results
        System.out.println("\nThe youngest friend is: " + youngestFriend + " with age " + youngestAge);
        System.out.println("The tallest friend is: " + tallestFriend + " with height " + tallestHeight + " cm");

        //Closing the Scanner Stream 
		input.close();
    }
}
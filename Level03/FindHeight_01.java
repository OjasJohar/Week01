import java.util.Random;

public class FindHeight_01 {

    // Method to generate random heights between 150 cm and 250 cm for each player
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        
        // Generate random heights between 150 and 250 cm
        for (int i = 0; i < size; i++) {
            heights[i] =(int) (Math.random()*(250-150)+150); // Random height between 150 and 250
        }
        
        return heights;
    }

    // Method to find the sum of all heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height of the players
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        int teamSize = 11; // The football team consists of 11 players
        int[] heights = generateHeights(teamSize); // Generate heights for all players

        // Display the heights of all players
        System.out.println("Player Heights (in cm): ");
        for (int i = 0; i < teamSize; i++) {
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cm");
        }

        // Calculate the sum, mean, shortest, and tallest heights
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Total sum of heights: " + sum + " cm");
        System.out.println("Mean height: " + mean + " cm");
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
    }
}
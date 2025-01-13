public class GenerateRandom_12 {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        
        // Generate random 4-digit numbers and store them in the array
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000;  // Random number between 1000 and 9999
        }
        
        return numbers;
    }

    // Method to find the average, minimum, and maximum values of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double[] result = new double[3];
        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;

        // Iterate through the array to find sum, min, and max
        for (int i=0;i<numbers.length;i++) {
            sum =sum+numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        // Calculate the average
        double average = sum / numbers.length;

        // Store the results in the result array
        result[0] = average;
        result[1] = min;
        result[2] = max;

        return result;
    }

    public static void main(String[] args) {
        int size = 5;  // We are generating 5 random numbers
        int[] randomNumbers = generate4DigitRandomArray(size);
        
        // Display the generated random numbers
        System.out.println("Generated Random 4-Digit Numbers: ");
        for (int i=0;i<randomNumbers.length;i++) {
            System.out.println(randomNumbers[i]);
        }
        
        // Find the average, minimum, and maximum values
        double[] stats = findAverageMinMax(randomNumbers);
        
        // Display the results
        System.out.println("\nAverage Value: " + stats[0]);
        System.out.println("Minimum Value: " + stats[1]);
        System.out.println("Maximum Value: " + stats[2]);
    }
}
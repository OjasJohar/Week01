import java.util.Scanner;

public class Int_Operation_08 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        // Taking user inputs for name, cities, and distances
        System.out.println("Enter your name ");
        String name = input.nextLine();
        
        System.out.println("Enter your starting city (fromCity) ");
        String fromCity = input.nextLine();
        
        System.out.println("Enter your viaCity ");
        String viaCity = input.nextLine();
        
        System.out.println("Enter your destination city (toCity) ");
        String toCity = input.nextLine();
        
        System.out.println("Enter the distance from " + fromCity + " to " + viaCity + " in miles");
        double fromToVia = input.nextDouble();
        
        System.out.println("Enter the distance from " + viaCity + " to " + toCity + " in miles");
        double viaToFinalCity =input.nextDouble();
        
        System.out.println("Enter the total time taken for the journey (in hours) ");
        double timeTaken = input.nextDouble();
        
        // Calculate the total distance traveled
        double totalDistance = fromToVia + viaToFinalCity;
        
        // Calculate the average speed of the journey
        double averageSpeed = totalDistance / timeTaken;
        
        // Print the results
        System.out.println("\nJourney Details for " + name + ":");
        System.out.println("Starting City: " + fromCity);
        System.out.println("Via City: " + viaCity);
        System.out.println("Destination City: " + toCity);
        System.out.println("Distance from " + fromCity + " to " + viaCity + ": " + fromToVia + " miles");
        System.out.println("Distance from " + viaCity + " to " + toCity + ": " + viaToFinalCity + " miles");
        System.out.println("Total distance traveled: " + totalDistance + " miles");
        System.out.println("Total time taken: " + timeTaken + " hours");
        System.out.println("Average speed of the journey: " + averageSpeed + " miles/hour");
        
    
        input.close();
    }
}
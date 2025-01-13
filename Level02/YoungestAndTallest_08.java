import java.util.Scanner;

public class YoungestAndTallest_08 {

    // method to find youngest:
    public static String findSmallest(int age1, int age2, int age3) {

        // variable to store smallest height
        String smallest;

        // finding the smallest height
        if (age1 < age2 && age1 < age3) {
            smallest = "Amar";
        } else if (age2 < age1 && age2 < age3) {
            smallest = "Akbar";
        } else {
            smallest = "Anthony";
        }

        return smallest;

    }

    public static String findLargest(int height1, int height2, int height3) {

        // variable to store tallest height
        String largest;

        // finding the largest height
        if (height1 > height2 && height1 > height3) {
            largest = "Amar";
        } else if (height2 > height1 && height2 > height3) {
            largest = "Akbar";
        } else {
            largest = "Anthony";
        }

        return largest;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking user input in age1 variable
        System.out.println("Enter the age of Amar: ");
        int age1 = input.nextInt();

        // taking user input in age2 variable
        System.out.println("Enter the age of akbar: ");
        int age2 = input.nextInt();

        // taking user input in age3 variable
        System.out.println("Enter the age of Anthony: ");
        int age3 = input.nextInt();

            // taking user input in height1 variable
        System.out.println("Enter the height of Amar: ");
        int height1 = input.nextInt();

        // taking user input in number2 variable
        System.out.println("Enter the height of Akbar: ");
        int height2 = input.nextInt();

        // taking user input in number3 variable
        System.out.println("Enter the height of Anthony: ");
        int height3 = input.nextInt();

        // finding the youngest and the tallest among three numbers
        String tallest = findLargest(height1, height2, height3);
        String youngest = findSmallest(age1, age2, age3);

        // printing the output
        System.out.println("The youngest age is of: " + youngest);
        System.out.println("The largest height is of: " + tallest);

        input.close();
    }
}    
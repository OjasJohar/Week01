import java.util.HashSet;
import java.util.Set;

public class GenerateOTP_07 {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        // Generate a random number between 100000 and 999999
        int otp = (int) (Math.random() * 900000) + 100000;
        return otp;
    }

    // Method to ensure that the OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> otpSet = new HashSet<>();
        // Add OTP numbers to the set and check for uniqueness
        for (int otp : otps) {
            if (!otpSet.add(otp)) {
                // If the OTP already exists in the set, it is not unique
                return false;
            }
        }
        return true;  // All OTPs are unique
    }

    public static void main(String[] args) {
        // Array to store the 10 generated OTPs
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        // Display the generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check if the OTPs are unique
        if (areOTPsUnique(otps)) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nSome OTPs are not unique.");
        }
    }
}
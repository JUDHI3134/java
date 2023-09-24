import java.math.BigInteger;

public class GcdLcm {
    public static void main(String[] args) {
        // Define the range
        int start = 24; // Smallest even number in the range
        int end = 248;  // Largest even number in the range

        // Initialize variables to store GCD and LCM
        BigInteger gcd = BigInteger.valueOf(start); // Start with the first even number
        BigInteger lcm = BigInteger.valueOf(start);

        // Loop through the even numbers in the range
        for (int i = start + 2; i <= end; i += 2) {
            // Calculate GCD and LCM for each number in the range
            BigInteger currentNumber = BigInteger.valueOf(i);
            gcd = gcd.gcd(currentNumber);
            lcm = lcm.multiply(currentNumber).divide(gcd);
        }

        // Output the GCD and LCM
        System.out.println("GCD of even numbers between 24 and 248: " + gcd);
        System.out.println("LCM of even numbers between 24 and 248: " + lcm);
    }
}

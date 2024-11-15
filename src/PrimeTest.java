import org.jetbrains.annotations.NotNull;

public class PrimeTest {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible by any number other than 1 and itself, not prime
            }
        }
        return true; // Otherwise, it is prime
    }

    public static boolean isPalindrome(@NotNull String text) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the cleaned text is the same forwards and backwards
        int length = cleanedText.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedText.charAt(i) != cleanedText.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }


}
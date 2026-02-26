/**
 * MAIN CLASS - Use Case 3: Palindrome Checker App
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author Viva Baranwal RA2411003010439
 * @version 3.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {


        String input = "level";


        input = input.toLowerCase();

        String reversed = "";


        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }


        if (input.equals(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is NOT a palindrome.");
        }
    }
}
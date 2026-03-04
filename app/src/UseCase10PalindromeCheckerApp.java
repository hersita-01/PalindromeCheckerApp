/**
 * ---------------------------------------------------------------
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * ---------------------------------------------------------------
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Description:
 * This program normalizes the input string by removing
 * spaces and converting it to lowercase before checking
 * if it is a palindrome.
 */

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Normalize string
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }

        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
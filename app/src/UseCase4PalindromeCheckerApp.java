/**
 * ---------------------------------------------------------------
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * ---------------------------------------------------------------
 *
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 */

public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "radar";

        // Convert string to character array
        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        // Two pointer comparison
        while (start < end) {

            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

    }
}
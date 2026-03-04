/**
 * ---------------------------------------------------------------
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * ---------------------------------------------------------------
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * Demonstrates palindrome validation using an
 * object-oriented design approach.
 */

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "radar";

        PalindromeService service = new PalindromeService();

        boolean result = service.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}


/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
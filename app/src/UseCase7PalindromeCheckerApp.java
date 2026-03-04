import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ---------------------------------------------------------------
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * ---------------------------------------------------------------
 *
 * Use Case 7: Deque Based Optimized Palindrome Checker
 *
 * Description:
 * Uses a Deque (Double Ended Queue) to compare characters
 * from both ends of the string.
 */

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "refer";

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Compare front and rear characters
        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }

        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
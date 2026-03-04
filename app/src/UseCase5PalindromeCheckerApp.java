import java.util.Stack;

/**
 * ---------------------------------------------------------------
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * ---------------------------------------------------------------
 *
 * Use Case 5: Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack data structure.
 * Characters are pushed into the stack and popped in reverse order
 * to compare with the original sequence.
 */

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "noon";

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        // Compare original string with popped characters
        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }

        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

    }
}
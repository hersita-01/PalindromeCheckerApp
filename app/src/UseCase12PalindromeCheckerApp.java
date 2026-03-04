import java.util.Stack;

/**
 * ---------------------------------------------------------------
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ---------------------------------------------------------------
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Demonstrates how different palindrome algorithms
 * can be selected dynamically using the Strategy Pattern.
 */

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Choose strategy
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}


/**
 * Strategy Interface
 */
interface PalindromeStrategy {

    boolean check(String input);

}


/**
 * Stack Strategy Implementation
 */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                return false;
            }

        }

        return true;
    }
}
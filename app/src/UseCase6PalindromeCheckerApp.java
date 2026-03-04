import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * ---------------------------------------------------------------
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * ---------------------------------------------------------------
 *
 * Use Case 6: Queue + Stack Based Palindrome Check
 *
 * Description:
 * Demonstrates palindrome validation using two data structures:
 * Queue (FIFO) and Stack (LIFO).
 *
 * Characters are inserted into both structures and then compared
 * by removing from queue front and stack top.
 */

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "civic";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters into both structures
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        // Compare queue vs stack
        while (!queue.isEmpty()) {

            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }

        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
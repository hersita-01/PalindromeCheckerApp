import java.util.LinkedList;

/**
 * ---------------------------------------------------------------
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * ---------------------------------------------------------------
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This program validates a palindrome using a LinkedList.
 * Characters are inserted into the list and compared from
 * both ends.
 */

public class UseCase8PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        LinkedList<Character> list = new LinkedList<>();

        // Add characters to linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        // Compare first and last elements
        while (list.size() > 1) {

            if (list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break;
            }

        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
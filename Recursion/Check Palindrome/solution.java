//GeeksForGeeks||Practise Solution 
class Solution {

    // Recursive function to check if a substring of 's' from index 'start' to 'end' is a palindrome
    boolean isPalindromeRecursive(String s, int start, int end) {
        // Base case: If start crosses end, it's a palindrome
        if (start >= end) return true;

        // If characters at start and end don't match, it's not a palindrome
        if (s.charAt(start) != s.charAt(end)) return false;

        // Move inward
        return isPalindromeRecursive(s, start + 1, end - 1);
    }

    // Function to check if the entire string is a palindrome
    boolean isPalindrome(String s) {
        return isPalindromeRecursive(s, 0, s.length() - 1);
    }
}

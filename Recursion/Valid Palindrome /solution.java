//Leetcode solution 
class Solution {

    // Recursive function to check if a substring from 'start' to 'end' is a palindrome
    public boolean palindrome(String s, int start, int end) {
        if (start >= end) return true; // Base case: reached the middle
        if (s.charAt(start) != s.charAt(end)) return false; // Mismatch found
        return palindrome(s, start + 1, end - 1); // Recursive check inward
    }

    public boolean isPalindrome(String s) {
        // Convert to lowercase and remove non-alphanumeric characters
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c)); // Normalize to lowercase
            }
        }

        // Use the cleaned string for palindrome check
        String filtered = cleaned.toString();
        return palindrome(filtered, 0, filtered.length() - 1);
    }
}

//GeeksforGeeks||Practise Solution 
class Solution {
    
    // Helper recursive function to reverse the character array in-place
    public static void reverse(char[] s, int start, int end) {
        if (start >= end) return; // Base case: when pointers cross, stop
        char c = s[start];        // Swap characters at start and end
        s[start] = s[end];
        s[end] = c;
        reverse(s, start + 1, end - 1); // Recursive call inward
    }

    // Main function to reverse a string using recursion
    public static String reverseString(String s) {
        char[] charArray = s.toCharArray();           // Convert string to char array
        reverse(charArray, 0, charArray.length - 1);  // Call recursive reverse
        return new String(charArray);                 // Convert char array back to string
    }
}

class Solution {
    // Recursive function to convert lowercase characters to uppercase
    void lowertoupper(char[] s, int index) {
        // Base case: if index reaches the end of the array, stop recursion
        if (index >= s.length) return;
        
        // Check if the current character is lowercase
        if (s[index] >= 'a' && s[index] <= 'z') {
            // Convert to uppercase using ASCII difference
            s[index] = (char) ('A' + s[index] - 'a');
        }
        
        // Recursive call for next character
        lowertoupper(s, index + 1);
    }

    // Function that converts the whole string to uppercase using recursion
    String to_upper(String str) {
        // Convert the input string to a character array for in-place modification
        char[] charArray = str.toCharArray();
        
        // Start recursion from index 0
        lowertoupper(charArray, 0);
        
        // Return the modified character array as a new string
        return new String(charArray);
    }
}

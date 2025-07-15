//GeeksForGeeks||Practise Solution
class Solution {

    // Recursive helper function to convert lowercase to uppercase
    void lowertoupper(char[] s, int index) {
        if (index >= s.length) return; // Base case: reached the end of array
        
        // Check if the character is lowercase
        if (s[index] >= 'a' && s[index] <= 'z') {
            // Convert to uppercase using ASCII manipulation
            s[index] = (char) ('A' + s[index] - 'a');
        }

        // Recursive call for the next character
        lowertoupper(s, index + 1);
    }

    // Function to convert entire string to uppercase using recursion
    String to_upper(String str) {
        // Convert the input string to a character array for in-place modification
        char[] charArray = str.toCharArray();

        // Start recursion from index 0
        lowertoupper(charArray, 0);

        // Convert the modified array back to a string
        return new String(charArray);
    }
}

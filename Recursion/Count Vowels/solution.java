class Solution {
    // Recursive function to count vowels in the string
    public int countVowels(String s, int index) {
        if (index == s.length()) return 0; // Base case: reached end of string

        // Convert to lowercase for uniform comparison
        char c = Character.toLowerCase(s.charAt(index));

        // Check if current character is a vowel
        int count = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;

        // Recursive call for the rest of the string
        return count + countVowels(s, index + 1);
    }
}

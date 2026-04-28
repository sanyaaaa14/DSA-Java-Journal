// User function Template for Java

class Solution {

    // Function to convert binary string to decimal number
    public int binaryToDecimal(String b) {
        
        int decimal = 0; // Stores final decimal result

        // Traverse each binary digit
        for (int i = 0; i < b.length(); i++) {
            
            // Multiply current result by 2 and add current digit
            decimal = decimal * 2 + (b.charAt(i) - '0');
        }

        // Return decimal equivalent
        return decimal;
    }
}

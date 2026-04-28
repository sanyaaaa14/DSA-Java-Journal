class Solution {

    // Function to convert decimal number to binary string
    static String decToBinary(int n) {
        
        // Special case: binary of 0 is "0"
        if (n == 0) 
            return "0";

        // StringBuilder to store binary digits
        StringBuilder sb = new StringBuilder();

        // Repeatedly divide by 2
        while (n > 0) {
            
            // Append remainder (0 or 1)
            sb.append(n % 2);

            // Update number
            n /= 2;
        }

        // Reverse to get correct binary order
        return sb.reverse().toString();
    }
}

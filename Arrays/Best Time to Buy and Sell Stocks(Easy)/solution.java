// Class definition
class Solution {
    
    // Method to calculate the maximum profit from stock prices
    public int maxProfit(int[] prices) {
        
        // Initialize 'min' to the first day's price (minimum price so far)
        int min = prices[0];
        
        // Initialize 'maxprofit' to 0 (we start with no profit)
        int maxprofit = 0;
        
        // Iterate over each day's stock price
        for (int i = 0; i < prices.length; i++) {
            
            // Update the minimum price if the current day's price is lower
            min = Math.min(min, prices[i]);
            
            // Calculate the potential profit for the current day
            // and update 'maxprofit' if this profit is greater
            maxprofit = Math.max(maxprofit, prices[i] - min);
        }
        
        // Return the maximum profit found
        return maxprofit;
    }
}

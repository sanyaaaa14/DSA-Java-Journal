import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        // Create a HashMap to store the frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count occurrences of each number
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Find the number that occurs exactly once
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key; // return the single number
            }
        }

        // If no single number found (edge case, shouldn't happen as per problem statement)
        return -1;
    }
}

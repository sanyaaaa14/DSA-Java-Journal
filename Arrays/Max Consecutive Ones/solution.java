class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currcount=0;  // to count current streak of consecutive 1s
        int maxcount=0;   // to store the maximum streak found so far

        // Traverse the array
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                currcount++;  // increase streak if current element is 1
            }
            else{
                // if we encounter 0, update maxcount and reset currcount
                maxcount=Math.max(maxcount,currcount);
                currcount=0;
            }
        }

        // In case the array ends with 1s, compare one last time
        return Math.max(maxcount,currcount);
    }
}

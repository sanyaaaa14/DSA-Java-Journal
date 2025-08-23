class Solution {
    public void moveZeroes(int[] nums) {
        int x=0;  // pointer to track the index where next non-zero element should be placed
        int i=0;  // iterator to traverse the array

        // First pass: Move all non-zero elements to the front
        while(i<nums.length){
            if(nums[i]!=0){
                nums[x]=nums[i];  // place the non-zero element at 'x'
                x++;              // increment position for next non-zero
            }
            i++;
        }

        // Second pass: Fill the rest of the array with 0's
        while(x<nums.length){
            nums[x++]=0;
        }
    }
}

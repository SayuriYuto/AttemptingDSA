class Solution {
    public int maxSubArray(int[] nums) {
        int maxSubArray = nums[0];
        int cursum = 0;
        for(int i=0;i<nums.length;i++){
            if(cursum<0) cursum = 0; // if the sum goes negative reset to 0 and start finding new subarray with greater positive sum
            cursum+=nums[i];
            maxSubArray = Math.max(cursum,maxSubArray);
        }
        return maxSubArray;
        
    }
}
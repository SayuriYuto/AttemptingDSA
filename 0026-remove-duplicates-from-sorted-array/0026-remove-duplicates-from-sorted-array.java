class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1,i=0;
        if(nums.length<2){
            return nums.length;
        }
        while(i<nums.length && j<nums.length){
            if(nums[i] == nums[j]){
                j++;
            }
            else{
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
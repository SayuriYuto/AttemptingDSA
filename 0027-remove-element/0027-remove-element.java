class Solution {
    public int removeElement(int[] nums, int val) {
        int i =0,j=0;
        // if(nums.length<2){
            if(nums.length==0){
                return 0;
            }
        //     if(nums[])
        //     return 0;
        // }
        while(i<nums.length&&j<nums.length){
            if(nums[j] == val){
                j++;
            }
            else{
                if(i<j){
                    nums[i]=nums[j];
                    
                }i++;
                    j++;
            }
        }
        return i;
    }
}
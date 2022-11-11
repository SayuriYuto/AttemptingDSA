class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0,j=0;
        if(nums[0]==0&&nums.length==1){
            return;
        }
        while(i<nums.length&&j<nums.length){
            if(nums[j]==0){
                // System.out.println(i+" "+j);
                j++;
            }
            else{
                // System.out.println(i+" "+j);
                if(i<j){
                    nums[i] = nums[j];
                }
                i++;
                j++;
            }
        }
        while(i<nums.length){
            nums[i++]=0;
        }
        // return nums;
    }
}
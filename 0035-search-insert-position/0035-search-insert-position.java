class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(right>=left){
            int pivot = left + (right - left)/2;
            // System.out.println(pivot + " " + left + " " + right);

            if(nums[pivot]<target){
                left = pivot+1;
            }
            else if(nums[pivot]>target){
                right = pivot-1;
            }
            else{
                return pivot;
            }
        }
        return left;
    }
}
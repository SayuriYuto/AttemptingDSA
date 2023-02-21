class Solution {
    static int unique = 0;
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        unique = 0;
        solve(left,right,nums);
        return unique;
    }
    static void solve(int start, int end, int[] nums){
        int mid = start + (end-start)/2;
        if(start == end){
            unique = nums[start];
            return;
        }
        // else if(end-start+1==3){
        //     if(nums[mid] == nums[mid-1]){
        //         unique = nums[mid+1];
        //         return;
        //     }
        //     else{
        //         unique = nums[mid-1];
        //         return;
        //     }
        // }
        
        int start1 = start, start2 = start,end1 = end,end2 = end;
        
        if(nums[mid] == nums[mid-1]){
            start1 = start;
            end1 = mid-2;
            start2 = mid+1;
            end2 = end;
        }
        if(nums[mid] == nums[mid+1]){
            start2 = mid+2;
            end2 = end;
            start1 = start;
            end1 = mid-1;
        }
        if(nums[mid] != nums[mid-1]&&nums[mid] != nums[mid+1]){
            unique = nums[mid];
            return;
        }
        if((end1-start1+1)%2 != 0){
            solve(start1,end1,nums);
        }
        if((end2 - start2+1)%2 != 0){
            solve(start2,end2,nums);
        }
    }
}
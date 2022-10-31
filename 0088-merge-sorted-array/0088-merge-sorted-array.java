class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p=0,k=0,index = 0;
        int ans[] = new int[n+m];
        while(p<m&&k<n){
            if(nums1[p]<nums2[k]){
                ans[index++]=nums1[p++];
            }
            else{
                ans[index++]=nums2[k++];
            }
        }
        while(p<m){
            ans[index++] = nums1[p++];
        }
        while(k<n){
            ans[index++] = nums2[k++];
        }
        // nums1 = ans;
        for(int i=0;i<n+m;i++){
            nums1[i] = ans[i];
        }
    }
}
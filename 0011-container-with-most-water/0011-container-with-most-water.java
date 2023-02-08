class Solution {
    public int maxArea(int[] height) {
        int left = 0,right = height.length-1;
        int maxVolume=0;
        while(left<right){
            int volume = Math.min(height[left],height[right]) * (right-left);
            maxVolume = Math.max(maxVolume,volume);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxVolume;
    }
}
class Solution {
//     fuck thsi shit bro, python to the win 
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i =0;i<nums.length;i++){
            map.put(i,target-nums[i]);
        }
        int ans[] = new int[2];
        for(int i =0;i<nums.length;i++){
            int val = map.get(i);
            map.remove(i);
            if(map.containsValue(target-val)){
                ans[0] = i;
                ans[1] = target-val;                
                break;
            }
           map.put(i,target-nums[i]);
        }
        for(int i :ans) System.out.println(i);
        for(int i = 0;i<nums.length;i++){
            
            if(nums[i] == target-ans[1] && i!=ans[0]){
                System.out.println(target-ans[1]+" "+ nums[i]+" "+i);
                ans[1] = i;
                break;
            }   
        }
        return ans;
    }
}
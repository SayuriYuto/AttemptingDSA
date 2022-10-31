class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int i =0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                int oldVal = map.get(nums1[i]);
                map.replace(nums1[i],oldVal,oldVal+1);
            }
            else{
                map.put(nums1[i],1);
            }
        }
        for(int i =0;i<nums2.length;i++){
            if(map2.containsKey(nums2[i])){
                int oldVal = map2.get(nums2[i]);
                map2.replace(nums2[i],oldVal,oldVal+1);
            }
            else{
                map2.put(nums2[i],1);
            }
        }
        
//         check intersection now
        ArrayList<Integer> arr = new ArrayList<>();
        for(Map.Entry m : map.entrySet()){
            if(map2.containsKey(m.getKey())){
                int key = (int)m.getKey();
                int count = Math.min(map.get(key),map2.get(key));
                for(int i =0;i<count;i++){
                    arr.add(key);
                }
            }
        }
        int[] ans = new int[arr.size()];
        for(int i =0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}
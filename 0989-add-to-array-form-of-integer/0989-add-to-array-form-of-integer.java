class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = num.length-1;
        int carry = 0;
        while(i>=0 || k!=0){
            if(i >=0){
                 k += num[i--];
            }
            ans.add(0 , k % 10);
            k /= 10;
        }
        return ans;
    }
}
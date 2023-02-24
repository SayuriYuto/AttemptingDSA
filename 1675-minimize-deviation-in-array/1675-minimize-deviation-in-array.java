class Solution {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int minValue=Integer.MAX_VALUE;
        for(int y:nums){
            if((y&1)==1)
                y<<=1;
            pq.add(y);
            minValue=Math.min(minValue,y);
        }
        int minDeviation=Integer.MAX_VALUE;
        while(!pq.isEmpty()){
            int curr=pq.poll();
            minDeviation=Math.min(minDeviation,curr-minValue);
            if((curr&1)==1)
                break;
            curr>>=1;
            minValue=Math.min(minValue,curr);
            pq.add(curr);
        }
        return minDeviation;
    }
}
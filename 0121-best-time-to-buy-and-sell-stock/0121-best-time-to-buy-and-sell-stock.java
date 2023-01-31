class Solution {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE; // least so far
        int maxprofit = 0;
        for(int i =0;i<prices.length;i++){
            if(prices[i]<lsf){
                lsf = prices[i];
            }
            int pisf = prices[i]-lsf; // profit if sold today
            maxprofit = Math.max(pisf, maxprofit);
        }
        return maxprofit;
    }
}
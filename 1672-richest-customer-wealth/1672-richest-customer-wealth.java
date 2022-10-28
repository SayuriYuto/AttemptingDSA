class Solution {
    public int maximumWealth(int[][] accounts) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i =0;i<accounts.length;i++){
            int total=0;
            for(int j=0;j<accounts[i].length;j++){
                total+=accounts[i][j];
            }
            arr.add(total);
        }
        Collections.sort(arr,Collections.reverseOrder());        System.out.println(arr);

        return arr.get(0);
    }
}
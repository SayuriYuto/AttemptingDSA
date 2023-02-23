class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        int projects[][] = new int [n][2]; //Initialize 2D array 
        
      //2D array of projects and capital 
        for(int i=0;i<n;i++){
            projects[i][0]= profits[i];
            projects[i][1]= capital[i];
        }
        
        //Sort projects array in increasing order of capital
        Arrays.sort(projects,(a,b) -> a[1]-b[1]);
        
        //Initialize priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        int i=0;
        while(k>0){
            
            while(i<capital.length && projects[i][1]<=w){
                pq.add(projects[i][0]); //add profits<=w in priorityqueue
                i++;
            }
                if(pq.isEmpty()) {
                    break;
                }
                w=w+pq.poll();
                k--;
            }
        return w;
    }
}
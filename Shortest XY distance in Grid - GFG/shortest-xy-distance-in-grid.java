//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");

            int N = Integer.parseInt(S[0]);
            int M = Integer.parseInt(S[1]);

            ArrayList<ArrayList<Character>> grid = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                ArrayList<Character> col = new ArrayList<>();
                String S1[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    col.add(S1[j].charAt(0));
                }
                grid.add(col);
            }

            Solution ob = new Solution();
            System.out.println(ob.shortestXYDist(grid, N, M));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
  static class Pair{
    int r,c,dis;
    Pair(int i,int j,int d){
      r=i; c=j; dis=d;
    }
  }
    static int shortestXYDist(ArrayList<ArrayList<Character>> grid, int n,int m) {
        //code here
        Queue<Pair> q=new LinkedList<>();
        int[][] vis=new int[n][m];
        
        for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
            if(grid.get(i).get(j)=='Y'){
              q.add(new Pair(i,j,0));
              vis[i][j]=1;
            }
          }
        }
        
        int ans=Integer.MAX_VALUE;
        int dr[]={-1,1,0,0};
        int dc[]={0,0,-1,1};
        
        while(!q.isEmpty()){
          Pair node=q.poll();
          int r=node.r;
          int c=node.c;
          int dis=node.dis;
          
          if(grid.get(r).get(c)=='X'){
            ans=Math.min(ans,dis);
          }
          
          for(int i=0;i<4;i++){
            int nr=r+dr[i];
            int nc=c+dc[i];
            
            if(nr>=0 && nr<n && nc>=0 && nc<m && vis[nr][nc]==0){
              q.add(new Pair(nr,nc,dis+1));
              vis[nr][nc]=1;
            }
          }
        }
        
        if(ans!=Integer.MAX_VALUE)return ans;
        return -1;       
    }
};
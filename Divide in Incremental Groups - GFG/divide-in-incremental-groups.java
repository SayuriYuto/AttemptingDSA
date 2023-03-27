//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int N = Integer.parseInt(br.readLine().trim());
            int K = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            System.out.println(ob.countWaystoDivide(N, K));
        }
    }
}

// } Driver Code Ends


class Solution {
   
   
    int solve(int n, int p, int k, int[][][] DP){
        int ans=0;
       
        if(k==0){
            if(n==0) return 1;
            else return 0;
        }
       
        if(n==0) return 0;
       
        if(DP[n][p][k] != -1) return DP[n][p][k];
       
        for(int i=p;i<=n;i++){
            ans+=solve( n-i, i , k-1, DP);
        }
        return DP[n][p][k] = ans;
    }
   
   
    public int countWaystoDivide(int N, int K) {
       
    int [][][] DP = new int[N+1][N+1][K+1];
       
        for(int[][] arr : DP){
           
            for(int [] brr: arr)
            Arrays.fill(brr , -1);
        }
       
        return solve(N,1,K,DP);
       
    }
   
}
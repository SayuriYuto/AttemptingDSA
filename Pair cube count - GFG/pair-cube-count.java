//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.pairCubeCount(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int pairCubeCount(int N) {
        int count=0;
        for(int i =1;i<=(int)Math.round(Math.cbrt(N));i++){
            if(ifperfectCube(N-(int)Math.round(Math.pow(i,3)))){
                // System.out.println(N-(int)Math.round(Math.pow(i,3)));
                count++;
            }
        }
        return count;
        
    }
    static boolean ifperfectCube(int n){
        if(n<0) return false;
        int cbrt = (int)Math.round(Math.cbrt(n));
        if(n == (int)Math.round(Math.pow(cbrt,3))){
            return true;
        }
        return false;
    }
};
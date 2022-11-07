//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            
            

            Solution ob = new Solution();
            
            System.out.println(ob.lookandsay(n));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String lookandsay(int n) {
        //your code here
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        for(int i =0;i<n-1;i++){
            arr = countNum(arr);
        }
        // int[] ans = new int[arr.size()];
  
        // ArrayList to Array Conversion
        String str = "";
        for (int i = 0; i < arr.size(); i++)
            str+= arr.get(i);
        return str;
    }
    
    static ArrayList<Integer> countNum(ArrayList<Integer> n){
        // System.out.println(n);
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 1;
        if(n.size()==1){
            arr.add(count); 
            arr.add(n.get(0));
            return arr;
        }
        if(n.size()==2){
            // for(int i=0;i<n.size();i++){
                if(n.get(0)==n.get(1)){
                    arr.add(2);
                    arr.add(n.get(0));
                    count = 1;
                    // break;
                }
                else{
                    arr.add(1);
                    arr.add(n.get(0));
                    arr.add(1);
                    arr.add(n.get(1));
                }
            // }
            return arr;
        }
        for(int i =0;i<n.size()-1;i++){
            if(n.get(i)==n.get(i+1)){
                count++;
            }
            else{
                arr.add(count);
                arr.add(n.get(i));
                count = 1;
            }
            if(i==n.size()-2){
                arr.add(count);
                arr.add(n.get(i+1));
                count = 1;
            }
        }
        return arr;
    }
}

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        
        int t = Integer.parseInt(br.readLine()); 

        while(t > 0){
            
            String input_line1[] = br.readLine().trim().split("\\s+");
            int X = Integer.parseInt(input_line1[0]);
            int Y = Integer.parseInt(input_line1[1]);
            
            String S = br.readLine(); 
            
            Solution ob = new Solution();
		
            System.out.println(ob.solve(X,Y,S)); 

            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static long solve(int X,int Y, String S)
    {    
        // code here
        String s1= "pr"; String s2 ="rp";
        if(X<Y){
            //swap higher value to X bcoz we write this code for higher value
            int temp = X;
            X=Y;
            Y=temp;
            String t= s1;
            s1 = s2;
            s2 = t;
        }
        long ans=0;
        //Now we know X has longer cost in any case and has string associated named s1
        Stack<Character> st = new Stack<>();
        
        for(int i=S.length()-1;i>=0;i--){
            
            Character curr = S.charAt(i), first= s1.charAt(0), second = s1.charAt(1);
            if( st.size()>0 && curr==first && st.peek() == second ){
                st.pop();
                ans+=X;
            }
            else
            st.push(curr);
        }
        
        //step 2 
        //Now check for remaining string in stack 
        //first pop remainning string from stack using StringBuilder
        StringBuilder remStr = new StringBuilder();
        while(st.size()>0) remStr.append(st.pop());
        
        S = remStr.toString();
        
        //in remaining check for the other cost Y, if any instance present, remove them now
        for(int i=S.length()-1;i>=0;i--){
            
            Character curr = S.charAt(i), first= s2.charAt(0), second = s2.charAt(1);
            if( st.size()>0 && curr==first && st.peek() == second ){
                st.pop();
                ans+=Y;
            }
            else
            st.push(curr);
        }
        
        return ans;
            
        
    }
}
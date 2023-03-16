//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] inp=read.readLine().split(" ");
            int S=Integer.parseInt(inp[0]);
            int D=Integer.parseInt(inp[1]);

            Solution ob = new Solution();
            System.out.println(ob.secondSmallest(S,D));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String secondSmallest(int S, int D){
      if(D*9<S)
        {
            return "-1";
        }
        
        var a = new int[D];
        var c = S - (D - 1) * 9;
        a[0] = c <= 1 ? 1 : c;
        var sum = S-a[0];
        var digits = D-1;
        
        for (int i = 1; i < D; i++)
        {
            var check = sum - (digits - 1) * 9;
            a[i] = check <= 0 ? 0 : check;
            sum = sum -a[i];
            digits--;
        }
        if(a[0]==9)
        {
            return "-1";
        }
        var ninePresent = false;
        for (int i = 0;i<D;i++)
        {
            if(a[i]==9 && ninePresent == false)
            {
                a[i]= 8;
                a[i-1] = a[i-1]+1;
                ninePresent = true;
            }
        }
        if(!ninePresent)
        {
            a[D - 1] = a[D-1]-1;
            a[D - 2] = a[D - 2] + 1;
        }
        String result = "";
        for (int i = 0;i<D;i++)
        {
            result = result + a[i];
        }
         return result;   
    }
}
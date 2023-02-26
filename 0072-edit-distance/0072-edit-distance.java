class Solution {
    public int minDistance(String word1, String word2) {
        int a = word1.length();
        int b = word2.length();
        int DP[][]= new int [a+1][b+1];
        for(int i=0;i<=a;i++) DP[i][0]=i;
        for(int j=0;j<=b;j++) DP[0][j]=j;
        for(int i =1;i<=a;i++){
            for(int j=1;j<=b;j++){
                
                if(word1.charAt(i-1) == word2.charAt(j-1)) DP[i][j]=DP[i-1][j-1];  
                else{
                DP[i][j] = 1+ Math.min(DP[i-1][j-1],Math.min(DP[i][j-1],DP[i-1][j]));
              }
            }
        }
        return DP[a][b];
    }
}
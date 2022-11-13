class Solution {
    public String reverseWords(String s) {
        Stack<String> stck = new Stack<>();
        s=s.trim();
        String starr[] = s.split(" ");
        for(int i=0;i<starr.length;i++){
            if(!starr[i].trim().isEmpty())
                stck.push(starr[i]);
        }
        String ans = "";
        int i =0;
        while(!stck.isEmpty()){
            if(i>0 && i<starr.length){
                ans+=" ";
            }
            ans=ans+stck.pop();
            i++;
        }
        return ans;
    }
}
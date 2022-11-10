class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stck = new Stack<>();
        for(int i =0;i<s.length();i++){
            if(!stck.isEmpty()&&stck.peek()==s.charAt(i)){
                stck.pop();
            }
            else{
                stck.push(s.charAt(i));
            }
        }
        String ans ="";
        while(!stck.isEmpty()){
            ans=stck.pop()+ans;
        }
        return ans;
    }
}
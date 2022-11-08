class Solution {
    public String makeGood(String s) {
        Stack<Character> stck = new Stack<>();
        for(int i =s.length()-1;i>=0;i--){
            if(!stck.empty()&&Math.abs(s.charAt(i)-stck.peek()) == 32){
                stck.pop();
            }
            else{
                stck.push(s.charAt(i));
            }
        }
        String str ="";
        while(!stck.empty()){
            str+=stck.pop();
        }
        return str;
    }
}
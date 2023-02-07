class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i =0;i<s.length();i++){
            char S = s.charAt(i);
            char T = t.charAt(i);
            if(map.containsKey(S)){
                if(map.get(S) != T){
                    return false;
                }
            }
            else{
                if(map.containsValue(T)){
                    return false;
                }
                else{
                    map.put(S,T);
                }
            }
        }
        return true;
    }
}
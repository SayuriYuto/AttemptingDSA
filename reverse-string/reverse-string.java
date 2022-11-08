class Solution {
    public void reverseString(char[] s) {
        int p = 0,q = s.length-1;
        while(p<q){
            char temp = s[p];
            s[p] = s[q];
            s[q] = temp;
            p++;
            q--;
        }
    }
}
// ["h","e","l","l"]

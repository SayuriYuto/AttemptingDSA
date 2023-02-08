class Solution {
    public int strStr(String haystack, String needle) {
        int ptr = 0, ans=-1,i=0;
        while(i<haystack.length()){
            if(haystack.charAt(i) == needle.charAt(ptr)){
                ptr++;
                System.out.println(haystack.charAt(i) + " " + needle.charAt(ptr-1) + " " + ptr + " "+ i);
            }
            else{
                i = i-ptr+1;
                ptr = 0;
                continue;
            }
            if(ptr == needle.length()){
                ans = i-ptr+1;
                break;
            }
            i++;
        }
        if(ptr<needle.length()){
            ans = -1;
        }
        return ans;
    }
}
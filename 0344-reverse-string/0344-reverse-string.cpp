class Solution {
public:
    void reverseString(vector<char>& s) {
        int ptr = 0;
        
        while(ptr<s.size()/2){
            char temp = s[ptr];
            s[ptr] = s[s.size()-ptr-1];
            s[s.size()-ptr-1] = temp;
            ptr++;
        }
    }
};
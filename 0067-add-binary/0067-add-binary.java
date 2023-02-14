class Solution {
    public String addBinary(String a, String b) {
        String ans = "";
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0) sum+=a.charAt(i) - '0';
            if(j>=0) sum+=b.charAt(j) - '0';
            ans = String.valueOf(sum%2) + ans;
            carry = sum / 2;
            i--;
            j--;
        }
        if (carry != 0) 
            ans = String.valueOf(carry) + ans;           
        return ans;
    }
}
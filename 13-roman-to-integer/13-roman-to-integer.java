class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int prev = getInteger(s.charAt(n - 1)) , result = prev , current;
        for(int i = n - 2 ; i >= 0 ; i--)
        {
            current = getInteger(s.charAt(i));
            if(current < prev)
                result -= current;
            else
                result += current;
            prev = current;
        }
        return result;
    }
    
    int getInteger(char c){
        switch(c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
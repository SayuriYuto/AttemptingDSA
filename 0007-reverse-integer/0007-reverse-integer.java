class Solution {
    public int reverse(int x) {
        long n=x;
        long reverse=0;
        int sign = 0;
        if(n<0){
            sign =1;
            n=Math.abs(n);
        }
        while(n>0){
            long rem = n%10;
            n/=10;
            reverse=reverse*10+rem;
        }
        if(reverse>(Math.round(Math.pow(2,31))-1)){
                return 0;
        }
        System.out.println(reverse);
        if(sign !=0) reverse =reverse*(-1);
        System.out.println((Math.round(Math.pow(2,31))));
        return Math.toIntExact(reverse);
    }
}
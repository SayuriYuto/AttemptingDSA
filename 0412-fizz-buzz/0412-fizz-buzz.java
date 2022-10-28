class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> answer = new ArrayList<String>();
        for(int i =1;i<=n;i++){
            String str="";
            if(i%3==0){
                str+="Fizz";
            }
            if(i%5==0){
                str+="Buzz";
            }
            if(i%3!=0&&i%5!=0){
                str+=String.format("%d",i);
            }
            answer.add(str);
        }
        return answer;
    }

}
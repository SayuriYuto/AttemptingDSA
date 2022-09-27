class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        ArrayList arr = new ArrayList();
        ArrayList arr2 = new ArrayList();

        for(int i =0;i<magazine.length();i++){
            arr.add(magazine.charAt(i));
        }
        for(int i = 0;i<ransomNote.length();i++){
            if(arr.contains(ransomNote.charAt(i))){
                arr.remove(arr.indexOf(ransomNote.charAt(i)));
            }
            else{
                return false;
            }
        }
        return true;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(head.next!=null){
            arr.add(head.val);
            // System.out.println(head.val);
            head = head.next;
        }
        arr.add(head.val);
        int j=arr.size()-1;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)!=arr.get(j--)){
                return false;
            }
        }
        return true;
    }
}
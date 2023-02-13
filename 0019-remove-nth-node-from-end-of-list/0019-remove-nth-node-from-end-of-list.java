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
    static int reverse = 0;
    static ListNode headTemp;
    
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        headTemp = head;
        reverse = 0;
        train(head,n,null);
        return headTemp;
    }
    
    public void train(ListNode l, int n, ListNode prevToRemove){
        if(l == null){
            return;  // reach end
        }
        train(l.next,n,l);
        
//         Once end is reached, start counting
        reverse++;
        if(reverse==n){
            if(prevToRemove==null){
                System.out.println(l.next);
                headTemp = l.next;
                return;
            }
            prevToRemove.next = l.next;
        }
    }
}
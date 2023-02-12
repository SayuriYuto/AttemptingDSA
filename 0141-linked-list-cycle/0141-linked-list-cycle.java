/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode ptr1 = head,ptr2 = head;
//         check before assigning
        while(ptr2.next!=null && ptr2.next.next!=null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
            if(ptr1==ptr2){
                return true;
            }
        }
        return false;       
    }
}
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
    public ListNode middleNode(ListNode Head) {
        int count=0;
        ListNode head = Head;
        // head.next=Head.next;
        while(head.next!=null){
            count++;
            head=head.next;
        }
        if(count%2!=0){
            count = (count/2)+1;
            for(int i=0;i<count;i++){
                Head = Head.next;
            }
            return Head;
        }
        else{
            count = (count/2)+1;
            for(int i=0;i<count-1;i++){
                Head = Head.next;
            }
            return Head;
        }
        
    }
}
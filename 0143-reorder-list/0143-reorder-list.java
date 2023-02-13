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
    Queue<Integer> q= new LinkedList<>();
    int count = 0;
    public void reorderList(ListNode head) {
        if(head == null) return ;
        if(count%2 == 0){
            q.add(head.val);
            head.val = q.poll();
        }
        else{
            q.add(head.val);
            head.val = 2000;
        }
        // System.out.println("Queue1 " + q);
        count++;
        
        reorderList(head.next);
        // System.out.println("Queue2 " + head.val);
        if(head.val == 2000){
            head.val = q.poll();
        }
        







        // head = head.next;
        // q.add(head.val);
        // head.val = 2000;
        // head = head.next;
        // reorderList(head);
        // System.out.println("Queue1 " + q);
        // if(head.val == 2000 && head!=null && q.size()!=0){
        //     head.val = q.poll();
        // }


        
        
    }
}
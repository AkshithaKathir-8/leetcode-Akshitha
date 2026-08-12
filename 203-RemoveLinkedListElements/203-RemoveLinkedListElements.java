// Last updated: 8/12/2026, 8:59:26 AM
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy =new ListNode();
        dummy.next = head;
        ListNode current = dummy;
        while(current != null && current.next!=null){
            if(current.next.val==val){
                current.next = current.next.next;
            }else 
            current = current.next;
        }return dummy.next;
        
    }
}
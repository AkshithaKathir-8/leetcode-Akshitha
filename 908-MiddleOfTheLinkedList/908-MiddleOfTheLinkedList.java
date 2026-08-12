// Last updated: 8/12/2026, 8:51:53 AM
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&& fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;  
    }
}
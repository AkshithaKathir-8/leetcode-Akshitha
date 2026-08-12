// Last updated: 8/12/2026, 9:04:02 AM
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
    public ListNode reverseKGroup(ListNode head, int k) {
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        int i = 0;
        ListNode newHead = null;
        ListNode prevGroupTail = null;
        ListNode nxtNode = null;
        while (i + k <= n) {
            ListNode currTail = null;
            ListNode groupOriginalHead = head;
            int count = 0;
            while (count < k) {
                nxtNode = head.next;
                head.next = currTail;
                currTail = head;
                head = nxtNode;
                count++;
            }
            if (i == 0) {
                newHead = currTail;
            } else {
                prevGroupTail.next = currTail;
            }
            prevGroupTail = groupOriginalHead;
            i += k;
        }
        if (prevGroupTail != null) {
            prevGroupTail.next = head;
        }
        return newHead != null ? newHead : head;
    }
}
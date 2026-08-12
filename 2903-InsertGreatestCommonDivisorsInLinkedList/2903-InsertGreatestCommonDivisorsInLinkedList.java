// Last updated: 8/12/2026, 8:45:14 AM
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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        while(curr!=null && curr.next!=null){
            int gcd = gcd(curr.val,curr.next.val);
            ListNode nn = new ListNode(gcd);
            nn.next = curr.next;
            curr.next = nn;
            curr = nn.next;

            }
            return head;
        }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
        
    }
}
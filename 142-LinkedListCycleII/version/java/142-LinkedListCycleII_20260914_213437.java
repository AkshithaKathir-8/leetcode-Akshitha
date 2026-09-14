// Last updated: 9/14/2026, 9:34:37 PM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        ListNode slow = head;
15        ListNode fast = head;
16
17        // checking here cycle
18        while(fast != null && fast.next != null){
19            slow = slow.next;
20            fast = fast.next.next;
21            if(slow == fast){
22                break;
23            }   
24        }
25
26        // no cycle
27        if(fast == null || fast.next == null){
28            return null;
29        }
30        
31        // cycle starting point
32        ListNode slow2 = head;
33        while(slow2 != slow){
34            slow2 = slow2.next;
35            slow = slow.next;
36
37        }
38        return slow;
39    }
40}
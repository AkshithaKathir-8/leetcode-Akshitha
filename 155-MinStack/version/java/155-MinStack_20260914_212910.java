// Last updated: 9/14/2026, 9:29:10 PM
1class MinStack {
2	private Node head;
3        
4    public void push(int x) {
5        if (head == null) 
6            head = new Node(x, x, null);
7        else 
8            head = new Node(x, Math.min(x, head.min), head);
9    }
10    
11    public void pop() {
12        head = head.next;
13    }
14    
15    public int top() {
16        return head.val;
17    }
18    
19    public int getMin() {
20        return head.min;
21    }
22        
23    private class Node {
24        int val;
25        int min;
26        Node next;
27            
28        private Node(int val, int min, Node next) {
29            this.val = val;
30            this.min = min;
31            this.next = next;
32        }
33    }
34}
// Last updated: 10/8/2026, 7:29:47 PM
1class Solution {
2
3    public String removeOuterParentheses(String s) {
4        int level = 0;
5        StringBuilder res = new StringBuilder();
6        for (int i = 0; i < s.length(); i++) {
7            char c = s.charAt(i);
8            if (c == ')') {
9                level--;
10            }
11            if (level > 0) {
12                res.append(c);
13            }
14            if (c == '(') {
15                level++;
16            }
17        }
18        return res.toString();
19    }
20}
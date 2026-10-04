// Last updated: 10/4/2026, 10:29:32 PM
1class Solution {
2    public boolean checkValidString(String s) {
3        int openCount = 0;
4        int closeCount = 0;
5        int length = s.length() - 1;
6        // Traverse the string from both ends simultaneously
7        for (int i = 0; i <= length; i++) {
8            // Count open parentheses or asterisks
9            if (s.charAt(i) == '(' || s.charAt(i) == '*') {
10                openCount++;
11            } else {
12                openCount--;
13            }
14            if (s.charAt(length - i) == ')' || s.charAt(length - i) == '*') {
15                closeCount++;
16            } else {
17                closeCount--;
18            }
19            if (openCount < 0 || closeCount < 0) {
20                return false;
21            }
22        }
23        return true;
24    }
25}
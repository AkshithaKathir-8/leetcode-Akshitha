// Last updated: 9/13/2026, 1:00:28 PM
1class Solution {
2    public boolean hasAlternatingBits(int n) {
3        int x = n ^ (n >> 1);
4        return (x & (x + 1)) == 0;
5    }
6}
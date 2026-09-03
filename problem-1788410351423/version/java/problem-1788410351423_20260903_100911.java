// Last updated: 9/3/2026, 10:09:11 AM
1class Solution {
2    public boolean uniformArray(int[] A) {
3        int min = A[0], odd = 0;
4        for (int x : A) {
5            min = Math.min(min, x);
6            odd |= x & 1;
7        }
8        return (min & 1) == odd;
9    }
10}
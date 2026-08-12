// Last updated: 8/12/2026, 11:08:49 AM
1class Solution {
2public int minCostClimbingStairs(int[] cost) {
3	int n = cost.length;
4	int first = cost[0];
5	int second = cost[1];
6	if (n<=2) return Math.min(first, second);
7	for (int i=2; i<n; i++) {
8		int curr = cost[i] + Math.min(first, second);
9		first = second;
10		second = curr;
11	}
12	return Math.min(first, second);
13}
14}
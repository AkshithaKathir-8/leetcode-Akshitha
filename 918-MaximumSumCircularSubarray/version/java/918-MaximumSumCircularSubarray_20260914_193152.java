// Last updated: 9/14/2026, 7:31:52 PM
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int maxSum = nums[0];
4        int minSum = nums[0];
5        int currMaxSum = nums[0];
6        int currMinSum = nums[0];
7        int totalSum = nums[0];
8        
9        for (int i = 1; i < nums.length; i++) {
10            currMaxSum = Math.max(currMaxSum + nums[i], nums[i]);
11            maxSum = Math.max(maxSum, currMaxSum);
12            
13            currMinSum = Math.min(currMinSum + nums[i], nums[i]);
14            minSum = Math.min(minSum, currMinSum);
15            
16            totalSum += nums[i];
17        }
18        
19        int circularSum = totalSum - minSum;
20
21        if (circularSum == 0) {
22            return maxSum;
23        }
24        return Math.max(maxSum, circularSum);
25    }
26}
// Last updated: 9/27/2026, 8:24:42 AM
1class Solution {
2    public int maxEqualAdjacentPairs(int[] nums) {
3        int b =0,m =0;
4        Map<Long,Integer>p = new HashMap<>();
5        for(int i=0;i<nums.length-1;i++){
6            if(nums[i]==nums[i+1]){
7                b++;
8            }else{
9                long k = ((long)Math.min(nums[i],nums[i+1])<<32)|Math.max(nums[i],nums[i+1]);
10            int c = p.getOrDefault(k,0)+1;
11            p.put(k,c);
12            m = Math.max(m,c);
13            }
14        }
15        return b + m;
16    }
17}
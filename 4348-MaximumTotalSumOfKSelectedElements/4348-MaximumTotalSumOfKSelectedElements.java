// Last updated: 8/12/2026, 8:43:25 AM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans = 0;
        int curr = mul;
        for(int i=nums.length-1;i>=nums.length-k;i--){
        ans+=Math.max((long)nums[i],(long)nums[i]*curr);
        curr--;
    }
        return ans;
    }
}
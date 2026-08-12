// Last updated: 8/12/2026, 8:44:43 AM
class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        long sum=0,ans=0;
        for(int i=0;i<n;i++)
            {
                if(sum > nums[i]) ans=sum+nums[i];
                sum+=nums[i];
            }
        return ans==0?-1:ans;
    }
}
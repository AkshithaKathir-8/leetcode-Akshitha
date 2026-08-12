// Last updated: 8/12/2026, 8:48:13 AM
class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        for(int i=1;i<nums.length;i++){
        nums[i]=nums[i]+nums[i-1];
        }return nums;//check another submission for a different approach 
    }
}
// Last updated: 8/12/2026, 9:01:18 AM
class Solution {
    public int singleNumber(int[] nums) {
        int i,x=0,n=nums.length;
        for(i=0;i<n;i++)
        x=x^nums[i];
        return x;        
    }
}
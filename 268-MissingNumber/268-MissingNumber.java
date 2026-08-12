// Last updated: 8/12/2026, 8:58:15 AM
class Solution {
    public int missingNumber(int[] nums) {
        int i,n=nums.length, x=0,sum=0;
        for(i=0;i<n;i++){
        sum+=nums[i];
    }x=n*(n+1)/2;
    return(x-sum);
    }
}
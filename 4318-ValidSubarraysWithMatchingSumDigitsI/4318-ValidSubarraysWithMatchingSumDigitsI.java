// Last updated: 8/12/2026, 8:43:53 AM
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        long ans =0;
        for(int i=0;i<nums.length;i++){
            long sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(isValid(sum,x)){
                    ans++;
                }
            }
        }
        return (int)ans;
    }
    private boolean isValid(long sum,int x){
        if(sum%10!=x)
            return false;
        long temp = sum;
        while(temp>=10){
            temp/=10;
        }
        return temp==x;
    }
}
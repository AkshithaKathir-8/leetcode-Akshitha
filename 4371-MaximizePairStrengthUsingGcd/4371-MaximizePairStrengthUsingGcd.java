// Last updated: 8/12/2026, 8:42:56 AM
class Solution {
    public long maxPairStrength(int[] nums) {
     long ms=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                long g=gcd(nums[i],nums[j]);
                long s=((long)nums[i]/g)*((long)nums[j]/g);
                ms=Math.max(ms,s);
            }
        }
        return ms;
    }
    private int gcd(long a,long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return (int)a;
    }
}
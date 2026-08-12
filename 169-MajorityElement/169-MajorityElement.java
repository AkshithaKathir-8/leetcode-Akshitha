// Last updated: 8/12/2026, 9:00:47 AM
class Solution {
    public int majorityElement(int[] nums) {
      int i,c=0,t=0,n=nums.length;
      for(i=0;i<n;i++){
        if(c==0)
        t=nums[i];
        if(t==nums[i])
        c++;
        else
        c--;
      }return t;
    }
}
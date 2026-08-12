// Last updated: 8/12/2026, 8:56:00 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int temp=0;
        for(int n:nums){
            if(n==0){
            count=0;
            }else{
            count++;
            }if(temp<count){
            temp=count;
            }
        }
        return temp;
    }
}
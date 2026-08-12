// Last updated: 8/12/2026, 8:53:10 AM
class Solution {
    public int search(int[] nums, int target) {
        int l=0,h=nums.length-1;
        while(l<=h){
            int mid =l+(h-l)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target)
            l=mid+1;
            else
            h=mid-1;
        }return -1;
}
}
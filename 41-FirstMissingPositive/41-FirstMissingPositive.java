// Last updated: 8/12/2026, 9:03:34 AM
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int target=1;
        for(int i:nums){
            if(i==target) target++;
            else if(i>target) return target;
        }
        return target;
    }
}
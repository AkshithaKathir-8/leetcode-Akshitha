// Last updated: 8/12/2026, 8:58:06 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        // Step 1: Move all non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        // Step 2: Fill the rest with zeros
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}

// USING TWO POINTERS
// class Solution {
//     public void moveZeroes(int[] nums) {
//         int n = nums.length;
//         int left = 0 ;
//         for(int right =0 ;right<n;right++){
//             if(nums[right]!=0){
//                 int temp = nums[right];
//                 nums[right]=nums[left];
//                 nums[left]=temp;
//                 left++;
//             }
//         }
//     }
//     }
// Last updated: 8/12/2026, 8:57:18 AM
import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;
        for (int num : nums2) {
            if (set.contains(num)) {
                temp[index++] = num;
                set.remove(num); // Avoid duplicates
            }
        }
        int[] ans = new int[index];
        for (int i = 0; i < index; i++) {
            ans[i] = temp[i];
        }
        return ans;
    }
}
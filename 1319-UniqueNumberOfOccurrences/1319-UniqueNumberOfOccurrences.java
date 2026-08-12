// Last updated: 8/12/2026, 8:49:21 AM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq = new int[2001];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i] + 1000]++;
        }
        for (int i = 0; i < 2001; i++) {
            if (freq[i] > 0) {
                for (int j = i + 1; j < 2001; j++) {
                    if (freq[i] == freq[j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
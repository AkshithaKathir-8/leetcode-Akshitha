// Last updated: 8/12/2026, 8:57:01 AM
class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[256]; 
        for (char c:s.toCharArray()) 
            freq[c]++;
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }
}

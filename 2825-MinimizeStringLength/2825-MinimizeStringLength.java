// Last updated: 8/12/2026, 8:45:31 AM
class Solution {
    public int minimizedStringLength(String s) {
        boolean[] seen = new boolean[26];
        int count = 0;

        for (char c : s.toCharArray()) {
            int id = c - 'a';
            if (!seen[id]) {
                seen[id] = true;
                count++;
            }
        }
        return count;
    }
}

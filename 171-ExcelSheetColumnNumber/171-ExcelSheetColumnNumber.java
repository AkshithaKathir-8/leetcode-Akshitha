// Last updated: 8/12/2026, 9:00:43 AM
class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (char ch : columnTitle.toCharArray()) {
            int value = ch - 'A' + 1;  
            result = result * 26 + value;
        }
        return result;
    }
}
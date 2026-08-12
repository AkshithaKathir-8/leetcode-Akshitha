// Last updated: 8/12/2026, 9:00:49 AM
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            int rem = columnNumber % 26;
            result.append((char)(rem + 'A'));
            columnNumber /= 26;
        }
        return result.reverse().toString();
    }
}
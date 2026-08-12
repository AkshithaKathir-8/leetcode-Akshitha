// Last updated: 8/12/2026, 8:57:43 AM
class Solution {
    public int bulbSwitch(int n) {
        int count = 0;
        long i = 1;
        while (i * i <= n) {
            count++;
            i++;
        }
        return count;
    }
}

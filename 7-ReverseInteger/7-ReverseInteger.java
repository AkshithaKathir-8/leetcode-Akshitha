// Last updated: 8/12/2026, 9:04:40 AM
class Solution {
    public int reverse(int x) {
        long rev = 0;

        while (x != 0) {
            int digit = x % 10;   
            rev = rev * 10 + digit;
            x = x / 10;

            // If overflow happens, return 0
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int) rev;
    }
}

// Last updated: 8/12/2026, 8:47:10 AM
class Solution {
    public boolean checkIfPangram(String s) {
          if (s.length() < 26) {
            return false;
        }
        for (char i = 'a'; i <= 'z'; i++) {
            if (s.indexOf(i) == -1) {
                return false;
            }
        }
        return true;
    }
}
    
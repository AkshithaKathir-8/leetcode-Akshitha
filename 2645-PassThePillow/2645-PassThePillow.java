// Last updated: 8/12/2026, 8:46:05 AM
class Solution {
    public int passThePillow(int n, int time) {
            int completed = time / (n - 1);
    int rem = time % (n - 1);
    if(completed % 2 != 0) {
        return n - rem;
    }
    return rem + 1;
    }
}
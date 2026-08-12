// Last updated: 8/12/2026, 8:42:54 AM
class Solution {
    public boolean canReach(int[] start, int[] target) {
        int startSum = start[0]+start[1];
        int targetSum = target[0]+target[1];
        return (startSum-targetSum)%2==0;
    }
}
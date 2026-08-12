// Last updated: 8/12/2026, 8:48:07 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drank = 0;
        int empty = 0;

        while (numBottles > 0) {
            drank += numBottles;
            empty += numBottles;
            numBottles = empty / numExchange;
            empty = empty % numExchange;
        }
        return drank;
    }
}

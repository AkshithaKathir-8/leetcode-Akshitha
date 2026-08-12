// Last updated: 8/12/2026, 8:45:46 AM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime)%24;
        
    }
}
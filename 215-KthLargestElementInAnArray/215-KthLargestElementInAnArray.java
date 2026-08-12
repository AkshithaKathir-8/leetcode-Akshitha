// Last updated: 8/12/2026, 8:59:12 AM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        //stores in descending order
        for(int ele :nums)
        pq.add(ele);//values are addded to the queue
        for(int i=0;i<k-1;i++)
        pq.poll();//delete the values until queue becomes empty
        return pq.poll();//returns the last value
        
    }
}
// Last updated: 8/12/2026, 8:56:29 AM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[1]-b[1]);
        int c = 0;
        int end = Integer.MIN_VALUE;
        for(int[] movie : intervals){
            if(movie[0] >= end){
             c++;
            end = movie[1];
        }
        }
        return intervals.length-c;
    }
}
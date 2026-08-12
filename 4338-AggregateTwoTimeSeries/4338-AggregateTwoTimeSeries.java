// Last updated: 8/12/2026, 8:43:38 AM
class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        int n=series1.length;
        int m = series2.length;
        List<Integer>timestamps=new ArrayList<>();
        int i=0,j=0;
        while(i<n||j<m){
            int t1=(i<n)?series1[i][0]:Integer.MAX_VALUE;
            int t2=(j<m)?series2[j][0]:Integer.MAX_VALUE;
            int currentMin = Math.min(t1,t2);
            timestamps.add(currentMin);
            if(i<n&&series1[i][0]==currentMin)i++;
            if(j<m&&series2[j][0]==currentMin)j++;
        }
        int totalTimestamps=timestamps.size();
        List<List<Integer>> res =new ArrayList<>(totalTimestamps);
        for(int k=0;k<totalTimestamps;k++){
            res.add(null);
        }
        int p1=n-1;
        int p2=m-1;
        int next1=0;
        int next2=0;
        for(int k=totalTimestamps-1;k>=0;k--){
            int t=timestamps.get(k);
            while(p1>=0&&series1[p1][0]>=t){
                next1=series1[p1][1];
                p1--;
            }
            while(p2>=0&&series2[p2][0]>=t){
                next2=series2[p2][1];
                p2--;
            }
            List<Integer>pair=new ArrayList<>(2);
            pair.add(t);
            pair.add(next1+next2);
            res.set(k,pair);
        }
        return res;
    }
}
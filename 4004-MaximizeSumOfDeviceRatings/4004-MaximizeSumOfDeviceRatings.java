// Last updated: 8/12/2026, 8:44:15 AM
class Solution {
    public long maxRatings(int[][] units) {
        int m = units.length;
        int n = units[0].length;
        if(n==1){
            long sum = 0;
            int min = Integer.MAX_VALUE;
            for(int[]row:units){
                sum+=row[0];
                min = Math.min(min,row[0]);
            }
            return sum-min+min;
        }
        long sum=0;
        int mf = Integer.MAX_VALUE;
        int ms = Integer.MAX_VALUE;
        for(int[]row:units){
            int f = Integer.MAX_VALUE;
            int s = Integer.MAX_VALUE;
            for(int x:row){
               if(x<f){
                s=f;
                f=x;
            }else if(x<s){
                s=x;
            }
        }
        sum+=s;
        mf = Math.min(mf,f);
        ms = Math.min(ms,s);
    }
    return sum-ms+mf;
}
}
// Last updated: 9/27/2026, 8:39:47 AM
1class Solution {
2    public long maxEarnings(int[][] m) {
3        Arrays.sort(m,(a,b)-> Integer.compare(a[1],b[1]));
4        long[]d=new long[m.length];
5        long ans = 0;
6        for(int i=0;i<m.length;i++){
7            int l=0,h=i-1,id=-1;
8            while(l<=h){
9                int mid = (l+h)/2;
10                if(m[mid][1]<=m[i][0]){id = mid;l=mid+1;}
11                else h = mid-1;
12            }
13            long cur = m[i][2]+(id>-1?Math.max(0,d[id]+m[i][0]):0);
14            ans = Math.max(ans,cur);
15            d[i]=Math.max(i>0?d[i-1]:Long.MIN_VALUE/2,cur-m[i][1]);
16        }
17        return ans;
18    }
19}
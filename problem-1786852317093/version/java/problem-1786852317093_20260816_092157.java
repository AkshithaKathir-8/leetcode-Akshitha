// Last updated: 8/16/2026, 9:21:57 AM
1class Solution {
2    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
3        int m=0;
4        for(int l: lights){
5            if(l>m)m=l;
6        }
7        int w=0;
8        for(int t: arrivalTime){
9            int r=t%period;
10            if(r>=m){
11                int wait = period-r;
12                if(wait>w)w=wait;
13            }
14        }
15        return w;
16    }
17}
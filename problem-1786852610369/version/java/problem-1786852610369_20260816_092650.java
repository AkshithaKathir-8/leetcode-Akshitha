// Last updated: 8/16/2026, 9:26:50 AM
1class Solution {
2    public int maximumGap(String skill, String station) {
3        int n =skill.length(),m=station.length();
4        if(n<=1)return 0;
5        int[]l=new int[n];
6        int[]r=new int[n];
7        int s=0;
8        for(int i=0;i<m&&s<n;i++){
9            if(station.charAt(i)==skill.charAt(s)){
10                l[s++]=i;
11            }
12        }
13        s=n-1;
14        for(int i=m-1;i>=0&&s>=0;i--){
15            if(station.charAt(i)==skill.charAt(s)){
16                r[s--]=i;
17            }
18        }
19        int max=0;
20        for(int i=1;i<n;i++){
21            max=Math.max(max,r[i]-l[i-1]);
22        }
23        return max;
24    }
25}
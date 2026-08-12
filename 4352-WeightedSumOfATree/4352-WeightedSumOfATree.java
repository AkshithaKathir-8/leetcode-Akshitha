// Last updated: 8/12/2026, 8:43:20 AM
class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        int n =parent.length,m=1;
        int []d=new int[n];
        d[0]=1;
        for(int i=1;i<n;i++){
            int cur=i,steps=0;
            while(cur!=-1&&d[cur]==0){
                cur=parent[cur];
                steps++;
            }
            int d1=d[cur]+steps;
            m=Math.max(m,d1);
            cur=i;
            while(cur!=-1&&d[cur]==0){
                d[cur]=d1--;
                cur=parent[cur];
            }
        }
        long t=0;
        for(int i=0;i<n;i++){
            t+=(long)nums[i]*(m-d[i]+1);
        }
        return t;
    }
}
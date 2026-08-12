// Last updated: 8/12/2026, 8:43:58 AM
class Solution {
    static final long MOD = 1000000007L;
    public int maxTotalValue(int[] value, int[] decay, int m) {
        long lo = 1,hi=1_000_000_000L;
        while(lo<=hi){
            long mid = (lo+hi)/2;
            long cnt = count(value,decay,mid);
            if(cnt>=m){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        long thres = hi;
        long total = 0;
        long ans = 0;
        for(int i=0;i<value.length;i++){
            long v = value[i];
            long d = decay[i];
            long k;
            if(d==0){
                k=(v>=thres)?m:0;
            }else if(v<thres){
                k=0;
            }else{
                k=(v-thres)/d+1;
            }
            total+=k;
            if(k>0){
                long last = v-(k-1)*d;
                ans+=k*(v+last)/2;
            }
        }
        long extra = total - m;
        ans-=extra*thres;
        ans%=MOD;
        if(ans<0) ans+=MOD;
        return (int)ans;
    }
    private long count(int[]value,int[]decay,long x ){
        long cnt = 0;
        for(int i=0;i<value.length;i++){
            long v = value[i];
            long d = decay[i];
            if(v<x)
                continue;
            long k;
            if(d==0){
                k=(long)1e18;
            }else{
                k=(v-x)/d+1;
            }
            cnt+=k;
            if(cnt>(long)1e18)
               return cnt;
        }
        return cnt;
    }
}
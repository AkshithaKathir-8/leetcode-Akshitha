// Last updated: 8/12/2026, 8:43:30 AM
class Solution {
    private static final int MOD=1000000007;
    public int countValidSequences(int n, int k) {
        if(n<k)return 0;
        if(k==0)return 0;
        int r=k-1;
        long total = nCr(n-1,r);
        long invalid =0;
        if((n-k)%2==0){
            int targetSum=(n-k)/2;
            invalid =nCr(targetSum+k-1,r);
        }
        long ans = (total-invalid+MOD)%MOD;
        return (int)ans;
    }
    private long nCr(int N,int R){
        if(R<0||R>N)return 0;
        if(R==0||R==N)return 1;
        if(R>N-R){
            R=N-R;
        }
        long num=1;
        long den = 1;
        for(int i=0;i<R;i++){
            num=(num*(N-i))%MOD;
            den=(den*(i+1))%MOD;
        }
        return (num*power(den,MOD-2))%MOD;
    }
    private long power(long base,long exp){
        long res = 1;
        base%=MOD;
            while(exp>0){
            if((exp&1)==1){
                res=(res*base)%MOD;
            }
            base=(base*base)%MOD;
            exp>>=1;
            }
        return res;
    }
}
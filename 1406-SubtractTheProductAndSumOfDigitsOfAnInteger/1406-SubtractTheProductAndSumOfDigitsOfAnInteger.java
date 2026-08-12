// Last updated: 8/12/2026, 8:48:58 AM
class Solution {
    public int subtractProductAndSum(int n) {
        int p=1,s=0;
        while(n!=0){
            int d = n%10;
            s+=d;
            p*=d;
            n/=10;
        }return(p-s);
    }
}
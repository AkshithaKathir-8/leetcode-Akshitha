// Last updated: 8/12/2026, 8:43:40 AM
class Solution {
    public boolean checkGoodInteger(int n) {
        int d=0,s=0;
        while(n>0){
           int dig=n%10;
            d+=dig;
            s+=dig*dig;
            n/=10;
        }if(s-d>=50)
            return true;
        else return false;
    }
}
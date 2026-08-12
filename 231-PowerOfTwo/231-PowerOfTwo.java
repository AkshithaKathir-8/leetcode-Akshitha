// Last updated: 8/12/2026, 8:58:43 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        //  if(n==1)
        //  return true;
        if(n<=0)
        return false;
        while(n%2==0){
             n/=2;
        }if(n==1)
        return true;
        else 
        return false;
    }
}
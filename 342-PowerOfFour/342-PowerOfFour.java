// Last updated: 8/12/2026, 8:57:34 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        //          if(n==1)
        //  return true;
        if(n<=0)
        return false;
        while(n%4==0){
             n/=4;
        }if(n==1)
        return true;
        else 
        return false;
        
    }
}
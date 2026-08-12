// Last updated: 8/12/2026, 8:57:40 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        //  if(n==1)
        //  return true;
        if(n<=0)
        return false;
        while(n%3==0){
             n/=3;
        }if(n==1)
        return true;
        else 
        return false;
    }
}
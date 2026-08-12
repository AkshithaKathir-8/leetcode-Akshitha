// Last updated: 8/12/2026, 9:04:38 AM
class Solution {
    public boolean isPalindrome(int x) {
        int r=0;
        int temp=x;
        if(x<0) return false;
	    while(x!=0){
	        int d = x%10;
             r= r*10 + d;
	        x/=10;
    } 
    if(temp==r){ 
         return true;
    } return false;
}
}
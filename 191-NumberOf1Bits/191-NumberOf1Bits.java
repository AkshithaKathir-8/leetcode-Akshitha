// Last updated: 8/12/2026, 8:59:52 AM
class Solution {
    public int hammingWeight(int n) {
        int count=0;
	    while(n!=0){//n=11
	   n = n & (n - 1);//it does binary operation of & ,then count if incremented until if not zero
	    count++;
	}	return(count);
    }
}
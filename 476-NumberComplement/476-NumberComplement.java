// Last updated: 8/12/2026, 8:56:04 AM
class Solution {
    public int findComplement(int num) {
        int t=num,m=0;
	    while(t>0){
	        m=(m<<1)|1;
	        t>>=1;
	    }return(m^num);
    }
}
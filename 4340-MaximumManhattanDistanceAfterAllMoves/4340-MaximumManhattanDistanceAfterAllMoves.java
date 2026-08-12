// Last updated: 8/12/2026, 8:43:35 AM
class Solution {
    public int maxDistance(String moves) {
        int u=0,d=0,l=0,r=0,k=0;
        for(char c:moves.toCharArray()){
            if(c=='U')u++;
            else if(c=='D')d++;
            else if(c=='L')l++;
            else if(c=='R')r++;
            else k++;
        }
        return Math.abs(r-l)+Math.abs(u-d)+k;
    }
}
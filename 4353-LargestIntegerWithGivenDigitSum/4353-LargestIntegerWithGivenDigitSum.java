// Last updated: 8/12/2026, 8:43:18 AM
class Solution {
    public int largestInteger(int n, int s) {
        if(s==0){
            return 0;
        }
        if(s>9*n){
            return -1;
        }
        int result=0;
        for(int i=0;i<n;i++){
                int take = Math.min(9,s);
                result=result*10+take;
                s-=take;
        }
        return result;
    }
}
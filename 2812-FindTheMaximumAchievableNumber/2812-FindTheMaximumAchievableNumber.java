// Last updated: 8/12/2026, 8:45:35 AM
class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int x=0,n=t;
                while(t>0){
                 x =num+t;
                  t--;num++;
    }
        return x+n;
    }
}
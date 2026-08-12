// Last updated: 8/12/2026, 8:46:30 AM
class Solution {
    public int countEven(int num) {
        int count=0;
            for(int i=1;i<=num;i++){
                int n = i;
                int sum=0;
                while(n>0){
                int d = n%10;
                sum+=d;
                n/=10;
                }
                if(sum%2==0)
         count++;
            }
        return(count);
        }
}
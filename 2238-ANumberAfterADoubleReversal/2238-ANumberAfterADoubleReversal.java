// Last updated: 8/12/2026, 8:46:34 AM
class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev=0,temp=num,rev2=0;
        while(num!=0){
            int d = num%10;
            rev=rev*10+d;
            num/=10;
        }while(rev!=0){
            int d = rev%10;
            rev2=rev2*10+d;
            rev/=10;
    }if(temp==rev2){
    return(true);
    }return(false);
}
}
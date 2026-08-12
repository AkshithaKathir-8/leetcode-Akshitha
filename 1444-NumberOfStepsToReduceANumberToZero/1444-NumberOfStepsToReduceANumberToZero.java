// Last updated: 8/12/2026, 8:48:53 AM
class Solution {
    public int numberOfSteps(int num) {
        int c=0;
       while(num!=0){
         if(num%2==0){
           num/=2;
           c++;
         }else{
         num=num-1;
         c++;
       }
    }return c;
}
}
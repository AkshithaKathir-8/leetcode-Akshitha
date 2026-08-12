// Last updated: 8/12/2026, 8:47:39 AM
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max =-1;
        for(int i=0 ; i<s.length()-1 ; i++){
            int curr =-1;
            for(int  j =i+1 ;  j <s.length() ; j++){
                if(s.charAt(i)==s.charAt(j)){
                    curr= (j-i)-1;
                    max = Math.max(curr,max);
                }
            }
        }
        return max;
    }
}
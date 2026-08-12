// Last updated: 8/12/2026, 8:48:48 AM
class Solution {
    public int maximum69Number (int num) {
    char[] digits = String.valueOf(num).toCharArray();
    for(int i=0;i<digits.length;i++){
        if(digits[i]=='6'){
        digits[i]='9';
        break;
        }
    }return Integer.parseInt(new String(digits));   
    }
}
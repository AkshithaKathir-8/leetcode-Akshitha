// Last updated: 8/12/2026, 9:04:33 AM
class Solution {
    int value(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
    public int romanToInt(String s) {
        int result =0;
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(i+1<s.length()){
            char next = s.charAt(i+1);
            if(value(c)>=value(next))
            result+=value(c);
            else{
                result+=value(next)-value(c);
                i++;
            }
        }else{
            result +=value(c);
        }
    }
    return result;
}
}
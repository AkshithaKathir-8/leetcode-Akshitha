// Last updated: 8/12/2026, 8:56:50 AM
class Solution {
    public String decodeString(String str) {
        Stack<Integer>st1=new Stack<>();
        Stack<String>st2=new Stack<>();
        int n = 0;
        String s = "";
        for(char c:str.toCharArray()){
            if(Character.isDigit(c))
            n=n*10+c-'0';
            else if(Character.isAlphabetic(c))
            s+=c;
            else if(c=='['){
                st1.push(n);
                st2.push(s);
                n=0;
                s="";
            }else{
                StringBuilder temp = new StringBuilder();
                int t = st1.pop();
                for(int i=0;i<t;i++)
                temp.append(s);
                s=st2.pop()+temp.toString();
            }
        }
        return s;
    }
}
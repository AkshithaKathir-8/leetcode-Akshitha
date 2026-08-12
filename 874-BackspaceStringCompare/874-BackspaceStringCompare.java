// Last updated: 8/12/2026, 8:52:07 AM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1= new Stack<>();
        Stack<Character> st2= new Stack<>();
        for(char c:s.toCharArray()){
            if(c!='#'){
                st1.push(c);
            }else if(!st1.isEmpty()){
                st1.pop();
            }
        }
         for(char ch:t.toCharArray()){
            if(ch!='#'){
                st2.push(ch);
            }else if(!st2.isEmpty()){
                st2.pop();
            }
        }
         return st1.equals(st2);
    }
}
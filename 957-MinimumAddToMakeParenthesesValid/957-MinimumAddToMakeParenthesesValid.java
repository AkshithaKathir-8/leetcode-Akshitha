// Last updated: 8/12/2026, 8:51:23 AM
class Solution {
    public int minAddToMakeValid(String s) {
        int open=0,close=0;
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                open ++;
            }else{
                if(open>0){
                    open--;
                }else{
                    close++;
                }
            }
        }return open+close;
    }
}

//USING STACK
// class Solution {
//     public int minAddToMakeValid(String s) {
//     Stack<Character> st = new Stack<>();
//         for(int i=0;i<s.length();i++){
//             if(!st.isEmpty()){
//                 if(s.charAt(i)=='(')
//                 st.push('(');
//                 else if(st.peek()=='(')
//                 st.pop();
//                 else
//                 st.push(s.charAt(i));
//             }else{
//                 st.push(s.charAt(i));
//             }
//         }
//         return st.size();
//     }
// }
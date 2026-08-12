// Last updated: 8/12/2026, 9:02:34 AM
class Solution {
    public String simplifyPath(String path) {
        String[]arr=path.split("/");
        Stack<String> st = new Stack<>();
        for(String ele : arr){
            if(ele.equals("")||ele.equals(".")){
            continue;
            }else if(ele.equals("..")){
            if (!st.isEmpty())
            st.pop();
            }else{
            st.push(ele);
            }
        }
        StringBuilder sb = new  StringBuilder ();
        for(String ele :st){
            sb.append("/").append(ele);
        }
        return sb.length()== 0 ? "/": sb.toString();
    }
}
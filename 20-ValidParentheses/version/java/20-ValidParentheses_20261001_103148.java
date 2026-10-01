// Last updated: 10/1/2026, 10:31:48 AM
1class Solution {
2    public boolean isValid(String s) {
3        if (s.length()%2!=0){
4            return false;
5        }
6        char[]stack = new char[s.length()];
7        int head=0;
8        for(int i=0;i<s.length();i++){
9            char c = s.charAt(i);
10            if(c=='('){
11                stack[head++]=')';
12            }else if(c=='{'){
13                stack[head++]='}';
14            }else if(c=='['){
15                stack[head++]=']';
16            }
17            else{
18                if(head==0||stack[--head]!=c){
19                    return false;
20                }
21            }
22        }
23        return head == 0;
24    }
25}
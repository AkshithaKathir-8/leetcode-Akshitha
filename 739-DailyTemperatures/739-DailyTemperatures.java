// Last updated: 8/12/2026, 8:53:39 AM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>st = new Stack<>();
        int n = temperatures.length;
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int idx = st.pop();
                ans[idx]=i - idx;
            }
            st.push(i);
        }return ans;                   
    }
}
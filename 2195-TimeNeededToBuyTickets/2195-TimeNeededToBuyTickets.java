// Last updated: 8/12/2026, 8:46:40 AM
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<tickets.length;i++)
        q.add(i);
        int time=0;
        while(!q.isEmpty()){
            int idx=q.poll();
            time++;
            tickets[idx]--;
            if(tickets[idx]>0)
            q.add(idx);
            if(idx==k && tickets[idx]==0)
            return time;
        }
        return time;
    }
}
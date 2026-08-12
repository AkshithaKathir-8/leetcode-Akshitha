// Last updated: 8/12/2026, 8:44:13 AM
class Solution {
    static class Edge{
        int to,wt;
        Edge (int to,int wt){
            this.to=to;
            this.wt=wt;
        }
    }
    static class State{
        int node,cnt,cost;
        State(int node,int cnt,int cost){
            this.node = node;
            this.cnt = cnt;
            this.cost = cost;
        }
    }
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        List<Edge>[]graph=new ArrayList[n];
        for(int i=0;i<n;i++)
            graph[i]=new ArrayList<>();
        for(int[]e:edges){
            graph[e[0]].add(new Edge(e[1],e[2]));
        }
        int[][]dist=new int [n][k+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }
        PriorityQueue<State>pq = new PriorityQueue<>((a,b)->a.cost-b.cost);
        dist[0][1]=0;
        pq.offer(new State(0,1,0));
        while(!pq.isEmpty()){
            State cur = pq.poll();
            if(cur.cost!=dist[cur.node][cur.cnt])
                continue;
            if(cur.node == n-1)
                return cur.cost;
            for(Edge e: graph[cur.node]){
                int nextCnt;
                if(labels.charAt(e.to)==labels.charAt(cur.node)){
                    nextCnt=cur.cnt+1;
                }else{
                    nextCnt=1;
                }
                if(nextCnt>k)
                    continue;
                int newCost = cur.cost+e.wt;
                if(newCost<dist[e.to][nextCnt]){
                    dist[e.to][nextCnt]=newCost;
                    pq.offer(new State(e.to,nextCnt,newCost));
                }
            }
        }
        return -1;
    }
}
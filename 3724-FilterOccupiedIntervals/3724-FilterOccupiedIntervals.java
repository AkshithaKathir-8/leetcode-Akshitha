// Last updated: 8/12/2026, 8:44:25 AM
class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        Arrays.sort(occupiedIntervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>merged = new ArrayList<>();
        for(int[]interval:occupiedIntervals){
            if(merged.isEmpty()){
                merged.add(new int[]{interval[0],interval[1]});
            }else{
                int[]last = merged.get(merged.size()-1);
                if(interval[0]<=last[1]+1){
                    last[1]=Math.max(last[1],interval[1]);
                }else{
                    merged.add(new int[]{interval[0],interval[1]});
                }
            }
    }
        List<List<Integer>> ans = new ArrayList<>();
        for(int []interval:merged){
            int s  = interval[0];
            int e = interval[1];
            if(e<freeStart||s>freeEnd){
                ans.add(Arrays.asList(s,e));
            }else{
                int leftStart  = s;
                int leftEnd = Math.min(e,freeStart-1);
                if(leftStart<=leftEnd){
                    ans.add(Arrays.asList(leftStart,leftEnd));
                }
                int rightStart = Math.max(s,freeEnd+1);
                int rightEnd = e;
                if(rightStart<=rightEnd){
                    ans.add(Arrays.asList(rightStart,rightEnd));
                }
            }
        }
        return ans;
    }
}
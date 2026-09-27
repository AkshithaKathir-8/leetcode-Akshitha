// Last updated: 9/27/2026, 8:30:58 AM
1class Solution {
2    public int maxSubarray(int[] nums) {
3        int n =nums.length, max=0;
4        for(int l=0;l<n;l++){
5            int []c = new int[501];
6            for(int r=l;r<n;r++){
7                int x = nums[r],ok=1;
8                for(int v=1;v<=500;v++){
9                    if(c[v]>0&&((x>v&&c[x-v]>(v*2==x?1:0))||(x+v<=500 && c[x+v]>0))){
10                        ok =0;
11                        break;
12                    }
13                }
14                if(ok==0)break;
15                c[x]++;
16                max = Math.max(max,r-l+1);
17            }
18        }
19        return max;
20    }
21}
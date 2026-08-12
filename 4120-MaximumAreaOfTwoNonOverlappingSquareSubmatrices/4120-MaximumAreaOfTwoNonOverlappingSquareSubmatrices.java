// Last updated: 8/12/2026, 8:44:09 AM
class Solution {
    public int maxArea(int[][] mat) {
        int m = mat.length;int n=mat[0].length;int[][]p =new int[m+1][n+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                p[i+1][j+1]=mat[i][j]+p[i][j+1]+p[i+1][j]-p[i][j];
            }
        }
        int low=1,high=Math.min(m,n);
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int r1=505,rm=-1,cm=505,cx=-1;
            for(int r=0;r<=m-mid;r++){
                for(int c=0;c<=n-mid;c++){
                    if(p[r+mid][c+mid]-p[r][c+mid]-p[r+mid][c]+p[r][c]==mid*mid){
                        r1=Math.min(r1,r);rm=Math.max(rm,r);
                        cm=Math.min(cm,c);cx=Math.max(cx,c);
                    }
                }
            }
            if(rm-r1>=mid||cx-cm>=mid){
                ans=mid*mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}
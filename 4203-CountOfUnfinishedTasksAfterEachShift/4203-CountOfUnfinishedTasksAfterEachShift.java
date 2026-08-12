// Last updated: 8/12/2026, 8:44:03 AM
class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        int n =tasks.length;
        int m =shifts.length;
        int[]r=new int[m];
        long[]pref=new long[n+1];
        for(int i=0;i<n;i++){
            pref[i+1]=pref[i]+tasks[i];
        }
        int cur=0;
        long rt=tasks[0];
        boolean rn = false;
        for(int i=0;i<m;i++){
            if(rn){
                cur=0;
                rt=tasks[0];
                rn=false;
            }
            long s=shifts[i];
            if(s<rt){
                rt-=s;
                r[i]=n-cur;
            }else{
                s-=rt;
                int si=cur+1;
                if(si>n){
                    r[i]=0;
                    rn=true;
                    continue;
                }
                int low=si,high=n,bi=si-1;
                while(low<=high){
                    int mid=(low+high)>>>1;
                        if(pref[mid]-pref[si]<=s){
                            bi=mid;
                            low=mid+1;
                        }else{
                            high=mid-1;
                        }
                    }
                    if(bi==n){
                        r[i]=0;
                        rn=true;
                    }else{
                        long ts=pref[bi]-pref[si];
                        long lt=s-ts;
                        cur=bi;
                        rt=tasks[cur]-lt;
                        r[i]=n-cur;
                    }
                }
        }
                return r;
            }
    }

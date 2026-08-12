// Last updated: 8/12/2026, 8:43:43 AM
class Solution {
    public long countRatioSubarrays(int[] nums, int a, int b) {
        int n=nums.length;
        long[]prefv = new long[n+1];
        int[]prefo=new int[n+1];
        int even=0,odd=0;
        prefv[0]=0;
        prefo[0]=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0)
                even++;
            else odd++;
            prefv[i+1]=(long)even*b-(long)a*odd;
            prefo[i+1]=odd;
        }
        long[]temp=prefv.clone();
        Arrays.sort(temp);
        int uniquelen=0;
        for(int i=0;i<temp.length;i++){
            if(i==0||temp[i]!=temp[i-1]){
                temp[uniquelen++]=temp[i];
            }
        }
        long[]uniqueVals=Arrays.copyOf(temp,uniquelen);
        fenwickTree bit = new fenwickTree(uniquelen);
        long totsub=0;
        int lastidx=0;
        for(int r=1;r<=n;r++){
            while(lastidx<r&&prefo[lastidx]<prefo[r]){
                int rank = Arrays.binarySearch(uniqueVals,prefv[lastidx])+1;
                bit.update(rank,1);
                lastidx++;
            }
            int currentRank = Arrays.binarySearch(uniqueVals,prefv[r])+1;
            totsub +=bit.querySuffix(currentRank);
        }
        return totsub;
    }
    private static class fenwickTree{
        int[]tree;
        int size;
        fenwickTree(int size){
            this.size=size;
            this.tree=new int[size+1];
        }
        void update(int idx,int delta){
            while(idx<=size){
                tree[idx]+=delta;
            idx+=idx&-idx;
            }
        }
        int query(int idx){
            int sum=0;
            while(idx>0){
                sum+=tree[idx];
                idx-=idx&-idx;
            }
            return sum;
        }
        int querySuffix(int idx){
            return query(size)-query(idx-1);
        }
    }
}
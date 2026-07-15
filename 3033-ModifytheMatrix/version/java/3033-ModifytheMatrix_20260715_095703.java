// Last updated: 15/07/2026, 09:57:03
1class Solution {
2    public int[] decompressRLElist(int[] nums) {
3        int n=nums.length;
4        int s=0;
5        for(int i=0;i<n;i+=2){
6            s+=nums[i];
7        }
8        int[] ans=new int[s];
9        int idx=0;
10        for(int i=0;i<n;i+=2){
11            int t=nums[i];
12            int r=nums[i+1];
13            for(int j=0;j<t;j++){
14                ans[idx]=r;
15                idx++;
16            }
17        }
18        return ans;
19    }
20}
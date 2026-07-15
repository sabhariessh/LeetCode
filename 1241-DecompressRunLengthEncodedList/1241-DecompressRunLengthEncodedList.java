// Last updated: 15/07/2026, 11:02:51
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n=nums.length;
        int s=0;
        for(int i=0;i<n;i+=2){
            s+=nums[i];
        }
        int[] ans=new int[s];
        int idx=0;
        for(int i=0;i<n;i+=2){
            int t=nums[i];
            int r=nums[i+1];
            for(int j=0;j<t;j++){
                ans[idx]=r;
                idx++;
            }
        }
        return ans;
    }
}
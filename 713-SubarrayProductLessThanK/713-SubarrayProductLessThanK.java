// Last updated: 03/07/2026, 11:38:49
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int l=0;
        int pro=1;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            pro*=nums[i];
            while(pro>=k){
                pro/=nums[l];
                l++;
            }
            cnt+=i-l+1;
        }
        return cnt;
    }
}
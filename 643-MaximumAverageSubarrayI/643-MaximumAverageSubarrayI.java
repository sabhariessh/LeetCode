// Last updated: 15/07/2026, 11:03:11
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int sum1=sum;
        for(int i=k;i<n;i++){
            sum-=nums[i-k];
            sum+=nums[i];
            sum1=Math.max(sum1,sum);
        }
        return (double) sum1/k;
    }
}
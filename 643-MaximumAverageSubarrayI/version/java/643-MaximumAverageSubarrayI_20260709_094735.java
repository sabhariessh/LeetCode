// Last updated: 09/07/2026, 09:47:35
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int n=nums.length;
4        int sum=0;
5        for(int i=0;i<k;i++){
6            sum+=nums[i];
7        }
8        int sum1=sum;
9        for(int i=k;i<n;i++){
10            sum-=nums[i-k];
11            sum+=nums[i];
12            sum1=Math.max(sum1,sum);
13        }
14        return (double) sum1/k;
15    }
16}
// Last updated: 19/08/2026, 15:08:59
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int currMin = nums[0], currMax = nums[0], minSum = nums[0], maxSum = nums[0];
4        int totalSum = nums[0];
5        for(int i=1;i<nums.length;i++)
6        {
7            currMax = Math.max(nums[i],currMax+nums[i]);
8            maxSum = Math.max(maxSum,currMax);
9
10            currMin = Math.min(nums[i],currMin+nums[i]);
11            minSum = Math.min(currMin,minSum);
12
13            totalSum += nums[i];
14        }
15        if(minSum == totalSum) return maxSum;
16        return Math.max(maxSum, totalSum - minSum);
17    }
18}
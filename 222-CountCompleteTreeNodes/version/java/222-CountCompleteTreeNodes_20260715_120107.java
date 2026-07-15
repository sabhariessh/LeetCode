// Last updated: 15/07/2026, 12:01:07
1class Solution {
2    public long largestPerimeter(int[] nums) {
3        Arrays.sort(nums);
4        long sum = 0;
5        long ans = -1;
6        for (int i = 0; i < nums.length; i++) {
7            if (nums[i] < sum) {
8                ans = nums[i] + sum;
9            }
10            sum += nums[i];
11        }
12        return ans;
13    }
14}
15
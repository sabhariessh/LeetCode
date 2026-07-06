// Last updated: 06/07/2026, 14:00:50
1class Solution {
2    public int maxSubArray(int[] nums) {
3    int res = nums[0];
4    int total = 0;
5    for (int n : nums) {
6        if (total < 0) {
7            total = 0;
8        }
9        total += n;
10        res = Math.max(res, total);
11    }
12    return res;  
13    }
14}
// Last updated: 03/07/2026, 15:57:30
1class Solution {
2    public int rob(int[] nums) {
3        if (nums.length == 1) return nums[0];
4        return Math.max(getMax(nums, 0, nums.length - 2), getMax(nums, 1, nums.length - 1));        
5    }
6    private int getMax(int[] nums, int start, int end) {
7        int prevRob = 0, maxRob = 0;
8        for (int i = start; i <= end; i++) {
9            int temp = Math.max(maxRob, prevRob + nums[i]);
10            prevRob = maxRob;
11            maxRob = temp;
12        }
13        return maxRob;
14    }
15}
// Last updated: 06/07/2026, 11:20:59
1class Solution {
2    public boolean canJump(int[] nums) {
3        int goal = nums.length - 1;
4        for(int i = nums.length - 1; i>= 0; i--){
5            if( i + nums[i] >= goal ){
6                goal = i;
7            }
8        }
9        return goal == 0;
10    }
11}
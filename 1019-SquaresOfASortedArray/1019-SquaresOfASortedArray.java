// Last updated: 03/07/2026, 11:38:35
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int l = 0;
        int r = n - 1;
        int i = n - 1;
        while (l <= r) {
            int left = nums[l] * nums[l];
            int right = nums[r] * nums[r];

            if (left > right) {
                result[i] = left;
                l++;
            } else {
                result[i] = right;
                r--;
            }
            i--;
        }
        return result;
    }
}
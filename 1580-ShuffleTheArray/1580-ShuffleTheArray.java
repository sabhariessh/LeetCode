// Last updated: 03/07/2026, 11:38:27
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        for(int i = 0; i < n; i++) {
            result[2 * i] = nums[i];        
            result[2 * i + 1] = nums[i+n];  
        }
        return result;
    }
}
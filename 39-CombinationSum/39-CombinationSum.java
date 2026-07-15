// Last updated: 15/07/2026, 12:03:53
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    private void backtrack(List<Integer> curr, int[] nums, int target, int index) {
        if (target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = index; i < nums.length; i++) {
            curr.add(nums[i]);
            backtrack(curr, nums, target - nums[i], i);
            curr.remove(curr.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(new ArrayList<>(), candidates, target, 0);
        return res;
    }
}
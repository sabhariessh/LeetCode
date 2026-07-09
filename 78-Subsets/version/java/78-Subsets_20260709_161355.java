// Last updated: 09/07/2026, 16:13:55
1class Solution {
2    List<List<Integer>> res = new ArrayList<>();
3    private void backtrack(List<Integer> curr, int[] nums, int target, int index) {
4        if (target == 0) {
5            res.add(new ArrayList<>(curr));
6            return;
7        }
8        if (target < 0) {
9            return;
10        }
11        for (int i = index; i < nums.length; i++) {
12            curr.add(nums[i]);
13            backtrack(curr, nums, target - nums[i], i);
14            curr.remove(curr.size() - 1);
15        }
16    }
17    public List<List<Integer>> combinationSum(int[] candidates, int target) {
18        backtrack(new ArrayList<>(), candidates, target, 0);
19        return res;
20    }
21}
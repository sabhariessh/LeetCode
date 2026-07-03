// Last updated: 03/07/2026, 11:40:26
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return balanced(nums, 0, nums.length - 1); 
    }
    private TreeNode balanced(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }
        int mid = (l + r) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = balanced(nums, l, mid - 1);
        node.right = balanced(nums, mid + 1, r);
        return node;
    }    
}
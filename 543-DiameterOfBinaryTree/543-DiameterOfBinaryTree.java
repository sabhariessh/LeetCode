// Last updated: 03/07/2026, 11:39:03
class Solution {
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res;        
    }
    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = dfs(root.left);
        int r = dfs(root.right);
        res = Math.max(res, l + r);
        return 1 + Math.max(l, r);
    }    
}
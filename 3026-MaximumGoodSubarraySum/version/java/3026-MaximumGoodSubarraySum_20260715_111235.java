// Last updated: 15/07/2026, 11:12:35
1class Solution {
2    public int countNodes(TreeNode root) {
3        if (root == null) {
4            return 0;
5        }
6        return 1 + countNodes(root.left) + countNodes(root.right);
7    }
8}
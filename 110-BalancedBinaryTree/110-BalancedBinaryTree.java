// Last updated: 03/07/2026, 11:40:25
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        return height(root)!=-1;
    }
    public int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int l=height(node.left);
        int r=height(node.right);
        int bf=Math.abs(l-r);
        if(bf>1||l==-1||r==-1){
            return -1;
        }
        return Math.max(l,r)+1;
    }
}
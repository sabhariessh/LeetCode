// Last updated: 03/07/2026, 11:38:59
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        if(issame(root,subRoot)){
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public boolean issame(TreeNode r1,TreeNode r2){
            if(r1==null&&r2==null){
                return true;
            }
            if(r1==null||r2==null||r1.val!=r2.val){
                return false;
            }
            return issame(r1.left,r2.left)&&issame(r1.right,r2.right);

    }
}
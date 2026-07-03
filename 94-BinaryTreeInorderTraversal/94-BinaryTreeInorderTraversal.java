// Last updated: 03/07/2026, 11:40:33
class Solution {
    public void binary(TreeNode root,List<Integer> ans){
        if(root==null){
            return;
        }
        binary(root.left,ans);
        ans.add(root.val);
        binary(root.right,ans);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        binary(root,ans);
        return ans;
    }
}
// Last updated: 15/07/2026, 12:03:28
class Solution {
   public static TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< inorder.length;i++){
            map.put(inorder[i],i);
        }
        int [] index={0};
        return binary(preorder,inorder,0,preorder.length-1,map,index);
    }
    private static TreeNode binary(int[] preorder, int[] inorder, int left, int right, HashMap<Integer, Integer> map,int [] index) {
        if(left>right){
            return null;
        }
        int curr=preorder[index[0]];
        index[0]++;
        TreeNode node=new TreeNode(curr);
        if(left==right){
            return node;
        }
        int inorderIndex=map.get(curr);
        node.left=binary(preorder,inorder,left,inorderIndex-1,map,index);
        node.right=binary(preorder,inorder,inorderIndex+1,right,map,index);
        return node;
    }
}
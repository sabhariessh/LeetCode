// Last updated: 14/07/2026, 09:51:17
1class Solution {
2   public static TreeNode buildTree(int[] preorder, int[] inorder) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int i=0;i< inorder.length;i++){
5            map.put(inorder[i],i);
6        }
7        int [] index={0};
8        return helper(preorder,inorder,0,preorder.length-1,map,index);
9    }
10    private static TreeNode helper(int[] preorder, int[] inorder, int left, int right, HashMap<Integer, Integer> map,int [] index) {
11        if(left>right){
12            return null;
13        }
14        int curr=preorder[index[0]];
15        index[0]++;
16        TreeNode node=new TreeNode(curr);
17        if(left==right){
18            return node;
19        }
20        int inorderIndex=map.get(curr);
21        node.left=helper(preorder,inorder,left,inorderIndex-1,map,index);
22        node.right=helper(preorder,inorder,inorderIndex+1,right,map,index   );
23        return node;
24    }
25}
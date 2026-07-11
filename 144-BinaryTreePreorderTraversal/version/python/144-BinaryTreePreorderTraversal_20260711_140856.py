# Last updated: 11/07/2026, 14:08:56
1# Definition for a binary tree node.
2# class TreeNode:
3#     def __init__(self, val=0, left=None, right=None):
4#         self.val = val
5#         self.left = left
6#         self.right = right
7class Solution:
8    def preOrderTraversal(self,root,ans):
9        if root==None:
10            return 0
11        ans.append(root.val)
12        self.preOrderTraversal(root.left,ans)
13        self.preOrderTraversal(root.right,ans)
14    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
15        ans=[]
16        self.preOrderTraversal(root,ans)
17        return ans
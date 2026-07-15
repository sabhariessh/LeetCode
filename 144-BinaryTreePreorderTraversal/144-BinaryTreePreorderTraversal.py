# Last updated: 15/07/2026, 12:03:16
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def preOrderTraversal(self,root,ans):
        if root==None:
            return 0
        ans.append(root.val)
        self.preOrderTraversal(root.left,ans)
        self.preOrderTraversal(root.right,ans)
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        ans=[]
        self.preOrderTraversal(root,ans)
        return ans
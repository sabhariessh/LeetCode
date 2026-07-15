# Last updated: 15/07/2026, 12:03:15
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def postOrderTraversal(self,root,ans):
        if root==None:
            return
        self.postOrderTraversal(root.left,ans)
        self.postOrderTraversal(root.right,ans)
        ans.append(root.val)
    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        ans=[]
        self.postOrderTraversal(root,ans)
        return ans
# Last updated: 11/07/2026, 14:56:14
1class Solution:
2    def singleNumber(self, nums: List[int]) -> int:
3        res=0
4        for i in nums:
5            res=res^i
6        return res
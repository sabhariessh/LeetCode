// Last updated: 06/08/2026, 11:32:24
1class Solution {
2    public void deleteNode(ListNode node) {
3        node.val = node.next.val;
4        node.next = node.next.next;
5    }
6}
// Last updated: 31/07/2026, 12:35:42
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3         ListNode res = head;
4        while (head != null && head.next != null) {
5            if (head.val == head.next.val) {
6                head.next = head.next.next;
7            } else {
8                head = head.next;
9            }
10        }
11        return res;    
12    }
13}
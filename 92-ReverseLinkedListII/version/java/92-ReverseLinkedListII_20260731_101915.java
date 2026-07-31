// Last updated: 31/07/2026, 10:19:15
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        if (head == null || head.next == null) return head;
4        ListNode dummy = new ListNode(-1);
5        dummy.next = head;
6        ListNode prev = dummy;
7        ListNode cur = head;
8        while (cur != null && cur.next != null) {
9            if (cur.val == cur.next.val) {
10                while (cur.next != null && cur.val == cur.next.val) {
11                    cur = cur.next;
12                }
13                prev.next = cur.next; 
14            } else {
15                prev = prev.next; 
16            }
17            cur = cur.next;
18        }
19
20        return dummy.next;
21    }
22}
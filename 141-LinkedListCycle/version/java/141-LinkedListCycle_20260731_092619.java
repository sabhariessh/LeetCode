// Last updated: 31/07/2026, 09:26:19
1class Solution {
2    public ListNode reverseBetween(ListNode head, int left, int right) {
3        if (head == null || left == right) {
4            return head;
5        }
6        ListNode dummy = new ListNode(0);
7        dummy.next = head;
8        ListNode prev = dummy;
9        for (int i = 1; i < left; i++) {
10            prev = prev.next;
11        }
12        ListNode curr = prev.next;
13        for (int i = 0; i < right - left; i++) {
14            ListNode next = curr.next;
15            curr.next = next.next;
16            next.next = prev.next;
17            prev.next = next;
18        }
19        return dummy.next;
20    }
21}
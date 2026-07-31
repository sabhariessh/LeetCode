// Last updated: 31/07/2026, 09:58:40
1class Solution {
2    public ListNode rotateRight(ListNode head, int k) {
3        if (head == null || head.next == null || k == 0) {
4            return head;
5        }
6        ListNode tail = head;
7        int length = 1;
8        while (tail.next != null) {
9            tail = tail.next;
10            length++;
11        }
12        k = k % length;
13        if (k == 0) {
14            return head;
15        }
16        tail.next = head;
17        int steps = length - k - 1;
18        ListNode newTail = head;
19        for (int i = 0; i < steps; i++) {
20            newTail = newTail.next;
21        }
22        ListNode newHead = newTail.next;
23        newTail.next = null;
24        return newHead;
25    }
26}
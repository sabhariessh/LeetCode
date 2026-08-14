// Last updated: 14/08/2026, 09:18:04
1class Solution {
2    public ListNode reverseKGroup(ListNode head, int k) {
3        ListNode temp = head;
4        int count = 0;
5        while (count < k) {
6            if (temp == null)
7                return head;
8            temp = temp.next;
9            count++;
10        }
11        ListNode prev = reverseKGroup(temp, k);
12        temp = head;
13        count = 0;
14        while (count < k) {
15            ListNode next = temp.next;
16            temp.next = prev;
17            prev = temp;
18            temp = next;
19            count++;
20        }
21        return prev;
22    }
23}
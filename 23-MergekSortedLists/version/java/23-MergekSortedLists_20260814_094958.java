// Last updated: 14/08/2026, 09:49:58
1class Solution {
2    public ListNode mergeKLists(ListNode[] lists) {
3        PriorityQueue<ListNode> que = new PriorityQueue<>((a, b) -> a.val - b.val);
4        for (ListNode node : lists) {
5            if (node != null) que.add(node);
6        }
7        ListNode dummy = new ListNode();
8        ListNode res = dummy; 
9        while (!que.isEmpty()) {
10            ListNode curr = que.poll();
11            res.next = curr;
12            res = res.next;    
13            if (curr.next != null) {
14                que.offer(curr.next);
15            }
16        }
17        return dummy.next;
18    }
19}
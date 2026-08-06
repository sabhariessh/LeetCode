// Last updated: 06/08/2026, 11:40:53
1public class Solution {
2    public Node copyRandomList(Node head) {
3        if (head == null) return null;
4        HashMap<Node, Node> oldToNew = new HashMap<>();
5        Node curr = head;
6        while (curr != null) {
7            oldToNew.put(curr, new Node(curr.val));
8            curr = curr.next;
9        }
10        curr = head;
11        while (curr != null) {
12            oldToNew.get(curr).next = oldToNew.get(curr.next);
13            oldToNew.get(curr).random = oldToNew.get(curr.random);
14            curr = curr.next;
15        }
16        return oldToNew.get(head);
17    }
18}
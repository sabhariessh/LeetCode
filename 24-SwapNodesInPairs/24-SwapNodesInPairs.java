// Last updated: 03/07/2026, 11:40:56
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode node=new ListNode(0,head);
        ListNode prev=node,cur=head;
        while(cur!=null&&cur.next!=null){
            ListNode first = cur.next.next;
            ListNode second = cur.next;
            second.next = cur;
            cur.next = first;
            prev.next = second;
            prev = cur;
            cur =first;
        }
        return node.next;  
    }
}
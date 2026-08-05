// Last updated: 05/08/2026, 09:06:41
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
         ListNode res = head;
        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return res;    
    }
}
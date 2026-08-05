// Last updated: 05/08/2026, 09:06:39
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode curr=head; 
        ListNode dummySmall=new ListNode(-1);
        ListNode smallTail=dummySmall;
        ListNode dummyLarge=new ListNode(0);
        ListNode largeTail=dummyLarge;
        while(curr!=null){
            ListNode temp=curr.next; 
            if(curr.val<x){
                smallTail.next=curr; 
                smallTail=smallTail.next; 
            }else{
                largeTail.next=curr;  
                largeTail=largeTail.next; 
            }
            curr.next=null; 
            curr=temp; 
        }
        smallTail.next=dummyLarge.next;  
        return dummySmall.next;
    }
}
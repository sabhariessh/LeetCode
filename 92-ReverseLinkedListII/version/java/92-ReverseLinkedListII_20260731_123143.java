// Last updated: 31/07/2026, 12:31:43
1class Solution {
2    public ListNode partition(ListNode head, int x) {
3        ListNode curr=head; 
4        ListNode dummySmall=new ListNode(-1);
5        ListNode smallTail=dummySmall;
6        ListNode dummyLarge=new ListNode(0);
7        ListNode largeTail=dummyLarge;
8        while(curr!=null){
9            ListNode temp=curr.next; 
10            if(curr.val<x){
11                smallTail.next=curr; 
12                smallTail=smallTail.next; 
13            }else{
14                largeTail.next=curr;  
15                largeTail=largeTail.next; 
16            }
17            curr.next=null; 
18            curr=temp; 
19        }
20        smallTail.next=dummyLarge.next;  
21        return dummySmall.next;
22    }
23}
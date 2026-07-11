// Last updated: 11/07/2026, 14:57:38
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        ListNode lista = headA;
15        ListNode listb = headB;
16
17        while (lista != listb) {
18            lista = (lista != null) ? lista.next : headB;
19            listb = (listb != null) ? listb.next : headA;
20        }
21
22        return lista;   
23    }
24}
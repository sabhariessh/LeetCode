// Last updated: 13/08/2026, 11:48:50
1class Solution {
2    public int[] shortestToChar(String s, char c) {
3        int n = s.length();
4        int[] ans = new int[n];
5        int ptr1 = 0;
6        while (ptr1 < n && s.charAt(ptr1) != c) ptr1++;
7        int idx = 0;
8        for (; idx <= ptr1; idx++) {
9            ans[idx] = Math.abs(idx - ptr1);
10        }
11        int ptr2 = 0;
12        while (ptr2 < n) {
13            while (ptr1 < n && s.charAt(ptr1) != c) ptr1++;
14            ptr2 = ptr1 + 1;
15            while (ptr2 < n && s.charAt(ptr2) != c) ptr2++;
16            while (idx < n && idx <= ptr2) {
17                if (ptr2 < n) {
18                    ans[idx] = Math.min(Math.abs(idx - ptr1), Math.abs(idx - ptr2));
19                } else {
20                    ans[idx] = Math.abs(idx - ptr1);
21                }
22                idx++;
23            }
24            ptr1 = ptr2;
25        }
26        return ans;
27    }
28}
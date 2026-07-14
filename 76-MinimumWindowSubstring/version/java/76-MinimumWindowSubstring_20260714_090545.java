// Last updated: 14/07/2026, 09:05:45
1class Solution {
2    public String minWindow(String s, String t) {
3        if (s == null || t == null || s.length() == 0 || t.length() == 0 ||
4                s.length() < t.length()) {
5            return new String();
6        }
7        int[] map = new int[128];
8        int count = t.length();
9        int start = 0, end = 0, minLen = Integer.MAX_VALUE, startIndex = 0;
10        for (char c : t.toCharArray()) {
11            map[c]++;
12        }
13
14        char[] chS = s.toCharArray();
15
16        while (end < chS.length) {
17            if (map[chS[end++]]-- > 0) {
18                count--;
19            }
20            while (count == 0) {
21                if (end - start < minLen) {
22                    startIndex = start;
23                    minLen = end - start;
24                }
25                if (map[chS[start++]]++ == 0) {
26                    count++;
27                }
28            }
29        }
30
31        return minLen == Integer.MAX_VALUE ? new String() :
32                new String(chS, startIndex, minLen);
33    }
34}
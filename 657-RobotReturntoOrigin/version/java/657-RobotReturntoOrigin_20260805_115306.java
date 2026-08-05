// Last updated: 05/08/2026, 11:53:06
1class Solution {
2    public String reverseWords(String s) {
3        char[] ca = s.toCharArray();
4        int start = 0;
5        for (int i = 0; i <= ca.length; i++) {
6            if (i == ca.length || ca[i] == ' ') {
7                reverse(ca, start, i - 1);
8                start = i + 1;
9            }
10        }
11        return new String(ca);
12    }
13
14    private void reverse(char[] ca, int i, int j) {
15        while (i < j) {
16            char tmp = ca[i];
17            ca[i++] = ca[j];
18            ca[j--] = tmp;
19        }
20    }
21}
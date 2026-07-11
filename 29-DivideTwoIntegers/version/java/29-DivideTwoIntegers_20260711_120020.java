// Last updated: 11/07/2026, 12:00:20
1class Solution {
2    public int divide(int dividend, int divisor) {
3        if (dividend == Integer.MIN_VALUE && divisor == -1) {
4            return Integer.MAX_VALUE;
5        }
6        boolean negative = (dividend < 0) ^ (divisor < 0);
7        long dvd = Math.abs((long) dividend);
8        long dvs = Math.abs((long) divisor);
9        int ans = 0;
10        while (dvd >= dvs) {
11            int shift = 0;
12            while (dvd >= (dvs << (shift + 1))) {
13                shift++;
14            }
15            dvd -= (dvs << shift);
16            ans += (1 << shift);
17        }
18        return negative ? -ans : ans;
19    }
20}
// Last updated: 15/07/2026, 12:03:59
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean negative = (dividend < 0) ^ (divisor < 0);
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        int ans = 0;
        while (dvd >= dvs) {
            int shift = 0;
            while (dvd >= (dvs << (shift + 1))) {
                shift++;
            }
            dvd -= (dvs << shift);
            ans += (1 << shift);
        }
        return negative ? -ans : ans;
    }
}
// Last updated: 17/07/2026, 15:02:20
1class Solution {
2    public char findTheDifference(String s, String t) {
3        long sum = 0, diff = 0;
4        for (char c : t.toCharArray()) {
5            sum += c - 'a';
6        }
7        for (char c : s.toCharArray()) {
8            diff += c - 'a';
9        }
10        return (char) (sum - diff + 'a');
11    }
12}
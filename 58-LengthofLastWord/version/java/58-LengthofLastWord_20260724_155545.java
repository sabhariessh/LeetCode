// Last updated: 24/07/2026, 15:55:45
1class Solution {
2    public int lengthOfLastWord(String s) {
3        int end = s.length() - 1;
4        while (end >= 0 && s.charAt(end) == ' ') {
5            end--;
6        }
7        int start = end;
8        while (start >= 0 && s.charAt(start) != ' ') {
9            start--;
10        }
11        return end - start;        
12    }
13}
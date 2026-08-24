// Last updated: 24/08/2026, 09:16:35
1class Solution {
2    public String longestPalindrome(String s) {
3        if (s == null || s.length() == 0) {
4            return "";
5        }
6        int start = 0;
7        int end = 0;
8        for (int i = 0; i < s.length(); i++) {
9            int odd = expandAroundCenter(s, i, i);
10            int even = expandAroundCenter(s, i, i + 1);
11            int max_len = Math.max(odd, even);
12            if (max_len > end - start) {
13                start = i - (max_len - 1) / 2;
14                end = i + max_len / 2;
15            }
16        }
17        return s.substring(start, end + 1);        
18    }
19    private int expandAroundCenter(String s, int left, int right) {
20        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
21            left--;
22            right++;
23        }
24        return right - left - 1;
25    }    
26}
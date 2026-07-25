// Last updated: 25/07/2026, 10:03:20
1public class Solution {
2    int count = 0;    
3    public int countSubstrings(String s) {
4        if (s == null || s.length() == 0) {
5            return 0;
6        }
7        for (int i = 0; i < s.length(); i++) { 
8            extendPalindrome(s, i, i); 
9            extendPalindrome(s, i, i + 1); 
10        }   
11        return count;
12    }   
13    private void extendPalindrome(String s, int left, int right) {
14        while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
15            count++; left--; right++;
16        }
17    }
18}
// Last updated: 25/07/2026, 10:10:13
1public class Solution {
2    public int minSteps(String s, String t) {
3        int[] countS = new int[26];
4        int[] countT = new int[26];
5        for (char ch : s.toCharArray()) {
6            countS[ch - 'a']++;
7        }
8        for (char ch : t.toCharArray()) {
9            countT[ch - 'a']++;
10        }
11        int steps = 0;
12        for (int i = 0; i < 26; i++) {
13            steps += Math.abs(countS[i] - countT[i]);
14        }
15        return steps / 2;  
16    }
17}
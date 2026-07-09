// Last updated: 09/07/2026, 11:52:52
1class Solution {
2    public int characterReplacement(String s, int k) {
3        int[] freq = new int[26];
4        int left = 0;
5        int maxF = 0;
6        int maxL = 0;
7        int winL=0;
8        for (int right = 0; right < s.length(); right++) {
9            char ch=s.charAt(right);
10            char c=s.charAt(left);
11            freq[ch - 'A']++;
12            maxF = Math.max(maxF, freq[ch - 'A']);
13            winL=right-left+1;
14            if(winL-maxF>k){
15                freq[c - 'A']--;
16                left++;
17            }
18            maxL=Math.max(maxL,right-left+1);
19        }
20        return maxL;
21    }
22}
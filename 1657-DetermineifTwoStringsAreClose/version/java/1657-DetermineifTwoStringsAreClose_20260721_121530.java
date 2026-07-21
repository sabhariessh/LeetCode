// Last updated: 21/07/2026, 12:15:30
1class Solution {
2    public boolean closeStrings(String word1, String word2) {
3        int[] freq1 = new int[26];
4        int[] freq2 = new int[26];
5        for (char ch : word1.toCharArray()) {
6            freq1[ch - 'a']++;
7        }
8        for (char ch : word2.toCharArray()) {
9            freq2[ch - 'a']++;
10        }
11        for (int i = 0; i < 26; i++) {
12            if ((freq1[i] == 0 && freq2[i] != 0) || (freq1[i] != 0 && freq2[i] == 0)) {
13                return false;
14            }
15        }
16        Arrays.sort(freq1);
17        Arrays.sort(freq2);
18        for (int i = 0; i < 26; i++) {
19            if (freq1[i] != freq2[i]) {
20                return false;
21            }
22        }
23        return true;
24    }
25}
26
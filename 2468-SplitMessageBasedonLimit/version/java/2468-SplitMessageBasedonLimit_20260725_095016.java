// Last updated: 25/07/2026, 09:50:16
1class Solution {
2    public int minimumPushes(String word) {
3        int[] letterFrequency = new int[26];
4        for (char c : word.toCharArray()) {
5            letterFrequency[c - 'a']++;
6        }
7        Integer[] sortedFreq = new Integer[26];
8        for (int i = 0; i < 26; i++) {
9            sortedFreq[i] = letterFrequency[i];
10        }
11        Arrays.sort(sortedFreq, Collections.reverseOrder());
12        int totalPresses = 0;
13        for (int i = 0; i < 26; i++) {
14            if (sortedFreq[i] == 0) break;
15            totalPresses += (i / 8 + 1) * sortedFreq[i];
16        }
17        return totalPresses;
18    }
19}
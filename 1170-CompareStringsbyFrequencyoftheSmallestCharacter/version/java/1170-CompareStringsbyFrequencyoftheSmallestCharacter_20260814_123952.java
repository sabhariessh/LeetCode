// Last updated: 14/08/2026, 12:39:52
1class Solution {
2    public int[] numSmallerByFrequency(String[] queries, String[] words) {
3        int[] wordFreqs = new int[words.length];
4        for (int i = 0; i < words.length; i++) {
5            wordFreqs[i] = getF(words[i]);
6        }
7        Arrays.sort(wordFreqs);
8        int[] res = new int[queries.length];
9        for (int i = 0; i < queries.length; i++) {
10            int qFreq = getF(queries[i]);
11            res[i] = countGreater(wordFreqs, qFreq);
12        }
13        return res;
14    }
15    private int getF(String s) {
16        char minChar = 'z';
17        int count = 0;
18        for (int i = 0; i < s.length(); i++) {
19            char c = s.charAt(i);
20            if (c < minChar) {
21                minChar = c;
22                count = 1;
23            } else if (c == minChar) {
24                count++;
25            }
26        }
27        return count;
28    }
29    private int countGreater(int[] arr, int target) {
30        int left = 0, right = arr.length;
31        while (left < right) {
32            int mid = left + (right - left) / 2;
33            if (arr[mid] <= target) {
34                left = mid + 1;
35            } else {
36                right = mid;
37            }
38        }
39        return arr.length - left;
40    }
41}
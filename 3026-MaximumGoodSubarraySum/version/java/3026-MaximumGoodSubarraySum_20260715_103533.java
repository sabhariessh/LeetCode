// Last updated: 15/07/2026, 10:35:33
1class Solution {
2    public int maxTurbulenceSize(int[] arr) {
3        int inc = 1, dec = 1, result = 1;
4        for (int i = 1; i < arr.length; i++) {
5            if (arr[i] < arr[i - 1]) {
6                dec = inc + 1;
7                inc = 1;
8            } else if (arr[i] > arr[i - 1]) {
9                inc = dec + 1;
10                dec = 1;
11            } else {
12                inc = 1;
13                dec = 1;
14            }
15            result = Math.max(result, Math.max(dec, inc));
16        }
17        return result;
18    }
19}
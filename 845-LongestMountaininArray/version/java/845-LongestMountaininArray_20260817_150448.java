// Last updated: 17/08/2026, 15:04:48
1class Solution {
2    public int longestMountain(int[] arr) {
3        int n = arr.length;
4        int[] left = new int[n];   
5        int[] right = new int[n];  
6        for (int i = 0; i < n; i++) {
7            left[i] = 1;
8            right[i] = 1;
9        }
10        for (int i = 1; i < n; i++) {
11            if (arr[i] > arr[i - 1]) left[i] += left[i - 1];
12        }
13        for (int i = n - 2; i >= 0; i--) {
14            if (arr[i] > arr[i + 1]) right[i] += right[i + 1];
15        }
16        int maxi = 0;
17        for (int i = 0; i < n; i++) {
18            if (left[i] > 1 && right[i] > 1)
19                maxi = Math.max(maxi, left[i] + right[i] - 1);
20        }
21        return maxi;
22    }
23}
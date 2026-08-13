// Last updated: 13/08/2026, 11:42:54
1class Solution {
2    public int maxDistance(int[] position, int m) {
3        Arrays.sort(position);
4        int n = position.length;
5        int start = 1, end = position[n - 1] - position[0];
6        int ans = -1;
7        while (start <= end) {
8            int mid = start + (end - start) / 2;
9            int count = 1, currPos = position[0];
10            for (int i = 1; i < n; i++) {
11                if (position[i] >= currPos + mid) {
12                    count++;
13                    currPos = position[i];
14                }
15            }
16            if (count >= m) {
17                ans = mid;
18                start = mid + 1;
19            } else {
20                end = mid - 1;
21            }
22        }
23        return ans;
24    }    
25}
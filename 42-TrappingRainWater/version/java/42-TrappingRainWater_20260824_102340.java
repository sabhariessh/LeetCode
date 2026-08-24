// Last updated: 24/08/2026, 10:23:40
1class Solution {
2    public int trap(int[] height) {
3        int l = 0;
4        int r = height.length - 1;
5        int leftMax = 0;
6        int rightMax = 0;
7        int res = 0;
8        while (l < r) {
9            if (height[l] <= height[r]) {
10                if (height[l] >= leftMax) {
11                    leftMax = height[l];
12                } else {
13                    res += leftMax - height[l];
14                }
15                l++;
16            } else {
17                if (height[r] >= rightMax) {
18                    rightMax = height[r];
19                } else {
20                    res += rightMax - height[r];
21                }
22                r--;
23            }
24        }
25        return res;
26    }
27}
// Last updated: 14/08/2026, 12:11:46
1class Solution {
2    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
3        Arrays.sort(arr2);
4        int count = 0;
5        for (int num : arr1) {
6            if (isValid(arr2, num, d)) {
7                count++;
8            }
9        }
10        return count;
11    }
12    private boolean isValid(int[] arr2, int target, int d) {
13        int left = 0, right = arr2.length - 1;
14        while (left <= right) {
15            int mid = left + (right - left) / 2;
16            if (Math.abs(arr2[mid] - target) <= d) {
17                return false;
18            }
19            if (arr2[mid] < target) {
20                left = mid + 1;
21            } else {
22                right = mid - 1;
23            }
24        }
25        return true;
26    }
27}
// Last updated: 10/07/2026, 16:18:57
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int[] result = {-1, -1};
4        int left = binarySearch(nums, target, true);
5        int right = binarySearch(nums, target, false);
6        result[0] = left;
7        result[1] = right;
8        return result;        
9    }
10    private int binarySearch(int[] nums, int target, boolean isSearchingLeft) {
11        int left = 0;
12        int right = nums.length - 1;
13        int idx = -1;
14        while (left <= right) {
15            int mid = left + (right - left) / 2;
16            if (nums[mid] > target) {
17                right = mid - 1;
18            } else if (nums[mid] < target) {
19                left = mid + 1;
20            } else {
21                idx = mid;
22                if (isSearchingLeft) {
23                    right = mid - 1;
24                } else {
25                    left = mid + 1;
26                }
27            }
28        }
29        return idx;
30    }
31
32}
// Last updated: 13/08/2026, 11:44:02
1class Solution {
2    public boolean canSplit(int[] nums, int n, int k, int maxSum) {
3        int subarrayCount = 1;
4        int currentSum = 0;
5        for (int i = 0; i < n; i++) {
6            if (nums[i] > maxSum) {
7                return false;
8            }
9            if (currentSum + nums[i] <= maxSum) {
10                currentSum += nums[i];
11            } else {
12                subarrayCount++;
13                currentSum = nums[i];
14            }
15        }
16        return subarrayCount <= k;
17    }
18    public int splitArray(int[] nums, int k) {
19        int n = nums.length;
20        int sum = 0;
21        int ans = -1;
22        for (int i = 0; i < n; i++) {
23            sum += nums[i];
24        }
25        int start = 0;
26        int end = sum;
27        while (start <= end) {
28            int mid = start + (end - start) / 2;
29            if (canSplit(nums, n, k, mid)) {
30                ans = mid;
31                end = mid - 1;
32            } else {
33                start = mid + 1;
34            }
35        }
36        return ans;
37    }
38}
// Last updated: 14/08/2026, 12:19:26
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        List<Integer> res = new ArrayList<>();
4        for (int n : nums) {
5            if (res.isEmpty() || res.get(res.size() - 1) < n) {
6                res.add(n);
7            } else {
8                int idx = binarySearch(res, n);
9                res.set(idx, n);
10            }
11        }
12        return res.size();        
13    }
14    private int binarySearch(List<Integer> arr, int target) {
15        int left = 0;
16        int right = arr.size() - 1;
17        while (left <= right) {
18            int mid = (left + right) / 2;
19            if (arr.get(mid) == target) {
20                return mid;
21            } else if (arr.get(mid) > target) {
22                right = mid - 1;
23            } else {
24                left = mid + 1;
25            }
26        }
27        return left;
28    }    
29}
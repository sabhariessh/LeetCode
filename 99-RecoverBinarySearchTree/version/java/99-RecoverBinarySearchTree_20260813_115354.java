// Last updated: 13/08/2026, 11:53:54
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        Integer majority1 = 0;
4        Integer majority2 = 0;
5        int count1 = 0;
6        int count2 = 0;
7        for (int num : nums) {
8            if (num == majority1) {
9                count1++;
10            } else if (num == majority2) {
11                count2++;
12            } else if (count1 == 0) {
13                majority1 = num;
14                count1++;
15            } else if (count2 == 0) {
16                majority2 = num;
17                count2++;
18            } else {
19                count1--;
20                count2--;
21            }
22        }
23        count1 = 0;
24        count2 = 0;
25        for (int num : nums) {
26            if (num == majority1) {
27                count1++;
28            } else if (num == majority2) {
29                count2++;
30            }
31        }
32        List<Integer> res = new ArrayList<>();
33        int n = nums.length;
34        if (count1 > n / 3) {
35            res.add(majority1);
36        }
37        if (count2 > n / 3) {
38            res.add(majority2);
39        }
40        return res;        
41    }
42}
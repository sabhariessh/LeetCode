// Last updated: 16/07/2026, 10:10:52
1class Solution {
2    public int maximumSetSize(int[] nums1, int[] nums2) {
3        Set<Integer> s1 = new HashSet<>();
4        Set<Integer> s2 = new HashSet<>();
5        int a=0,b=0,c=0;
6        for (int x : nums1){
7            s1.add(x);
8        }
9        for (int x : nums2){
10            s2.add(x);
11        }
12        for (int x : s1) {
13            if (!s2.contains(x)){
14                a++;
15            }
16            else{
17                c++;
18            }
19        }
20        for (int x : s2) {
21            if (!s1.contains(x)){
22                b++;
23            }
24        }
25        int n = nums1.length;
26        a = Math.min(a, n / 2);
27        b = Math.min(b, n / 2);
28        return Math.min(a + b + c, n);
29    }
30}
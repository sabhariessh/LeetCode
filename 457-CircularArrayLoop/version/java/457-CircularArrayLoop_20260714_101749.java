// Last updated: 14/07/2026, 10:17:49
1class Solution {
2    public boolean circularArrayLoop(int[] nums) {
3        int[] color = new int[nums.length];
4        for(int i = 0 ; i < nums.length ; i++) {
5            if(color[i] == 0 && DFS(nums, color, i)){
6                return true;
7            } 
8        }
9        return false;
10    }
11    private boolean DFS(int[] nums, int[] color, int start) {
12        if(color[start] == 2) {
13            return false;
14        }
15        color[start] = 1;
16        int next = start + nums[start];
17        next = next % nums.length + nums.length;
18        next %= nums.length;
19        if(next == start || nums[next] * nums[start] < 0) {
20            color[start] = 2;
21            return false;
22        }
23        if(color[next] == 1) {
24            color[start] = 2;
25            return true;
26        }
27        if(DFS(nums, color, next)) {
28            return true;
29        }
30        color[start] = 2;
31        return false;
32    }
33}
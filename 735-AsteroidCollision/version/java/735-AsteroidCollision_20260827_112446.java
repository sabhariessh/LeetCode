// Last updated: 27/08/2026, 11:24:46
1class Solution {
2    public int[] asteroidCollision(int[] asteroids) {
3        Stack<Integer> stack = new Stack<>(); 
4        for (int a : asteroids) {
5            if (a > 0) {
6                stack.push(a);
7            } 
8            else {
9                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -a) {
10                    stack.pop();
11                }
12                if (stack.isEmpty() || stack.peek() < 0)  {
13                    stack.push(a);
14                }
15                if (stack.peek() == -a) {
16                    stack.pop();
17                }
18            }
19        }
20        int[] res = new int[stack.size()];
21        int i = stack.size() - 1;
22        while(!stack.isEmpty()) {
23            res[i--] = stack.pop();
24        }
25        return res;   
26    }
27}
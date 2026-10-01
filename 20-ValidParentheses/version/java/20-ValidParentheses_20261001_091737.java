// Last updated: 01/10/2026, 09:17:37
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack<>();
4        for (char ch : s.toCharArray()) {
5            if (ch == '(' || ch == '{' || ch == '[') {
6                stack.push(ch);
7            } 
8            else {
9                if (stack.isEmpty()) {
10                    return false;
11                }
12                char top = stack.pop();
13                if (ch == ')' && top != '(') {
14                    return false;
15                }
16                if (ch == '}' && top != '{') {
17                    return false;
18                }
19                if (ch == ']' && top != '[') {
20                    return false;
21                }
22            }
23        }
24        return stack.isEmpty();
25    }
26}
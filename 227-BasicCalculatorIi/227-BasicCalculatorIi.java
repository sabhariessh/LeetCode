// Last updated: 03/07/2026, 11:39:47
class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();

        int n = 0;
        char si = '+';

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            }

            if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {

                if (si == '+') {
                    st.push(n);
                } else if (si == '-') {
                    st.push(-n);
                } else if (si == '*') {
                    st.push(st.pop() * n);
                } else if (si == '/') {
                    st.push(st.pop() / n);
                }

                si = c;
                n = 0;
            }
        }

        int ans = 0;
        while (!st.isEmpty()) {
            ans += st.pop();
        }

        return ans;
    }
}
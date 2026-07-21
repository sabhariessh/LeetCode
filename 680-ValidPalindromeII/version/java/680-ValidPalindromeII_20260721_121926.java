// Last updated: 21/07/2026, 12:19:26
1class Solution {
2    public String multiply(String num1, String num2) {
3        if (num1.equals("0") || num2.equals("0")) {
4            return "0";
5        }
6        int m = num1.length();
7        int n = num2.length();
8        int[] res = new int[m + n];
9        for (int i = m - 1; i >= 0; i--) {
10            for (int j = n - 1; j >= 0; j--) {
11                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
12                int sum = mul + res[i + j + 1];
13                res[i + j + 1] = sum % 10;
14                res[i + j] += sum / 10;
15            }
16        }
17        StringBuilder ans = new StringBuilder();
18        int i = 0;
19        while (i < res.length && res[i] == 0) {
20            i++;
21        }
22        while (i < res.length) {
23            ans.append(res[i]);
24            i++;
25        }
26        return ans.toString();
27    }
28}
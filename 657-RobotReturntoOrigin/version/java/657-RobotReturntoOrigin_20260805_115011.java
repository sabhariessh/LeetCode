// Last updated: 05/08/2026, 11:50:11
1class Solution {
2    public boolean judgeCircle(String moves) {
3        int x = 0, y = 0;
4        for (char m : moves.toCharArray()) {
5            if (m == 'U') y++;
6            else if (m == 'D') y--;
7            else if (m == 'L') x--;
8            else if (m == 'R') x++;
9        }
10        return x == 0 && y == 0;
11    }
12}
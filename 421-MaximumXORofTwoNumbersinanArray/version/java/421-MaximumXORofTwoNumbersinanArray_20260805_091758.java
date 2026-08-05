// Last updated: 05/08/2026, 09:17:58
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        return s.length() == goal.length() && (s + s).contains(goal);
4    }
5}
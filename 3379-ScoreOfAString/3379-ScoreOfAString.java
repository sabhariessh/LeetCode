// Last updated: 03/07/2026, 11:38:13
class Solution {
    public int scoreOfString(String s) {
         int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            res += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return res;
    }
}
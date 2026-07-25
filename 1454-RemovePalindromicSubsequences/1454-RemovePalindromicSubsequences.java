// Last updated: 25/07/2026, 10:10:59
class Solution {
    public int removePalindromeSub(String s) {
	    if (s.equals(new StringBuilder(s).reverse().toString())) {
            return 1;
        }
	return 2;
}
}
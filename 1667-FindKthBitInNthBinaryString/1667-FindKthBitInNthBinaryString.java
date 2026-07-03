// Last updated: 03/07/2026, 11:38:26
class Solution {
    public char findKthBit(int n, int k) {
        if (n == 1) {
            return '0';
        }
        int length = (1 << n) - 1;
        int mid = (length / 2) + 1;
        if (k == mid) {
            return '1';
        }
        if (k < mid) {
            return findKthBit(n - 1, k);
        }
        int mirrored = length - k + 1;
        char result = findKthBit(n - 1, mirrored);
        if (result == '0') {
            return '1';
        } else {
            return '0';
        }
    }
}
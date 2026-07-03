// Last updated: 03/07/2026, 11:39:19
import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        freq[c - 'a']++;
        queue.add(new int[]{c - 'a', i});
        while (!queue.isEmpty() && freq[queue.peek()[0]] > 1) {
            queue.poll();
            }
        }

        return queue.isEmpty() ? -1 : queue.peek()[1];
    }
}

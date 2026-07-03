// Last updated: 03/07/2026, 11:38:17


class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] count = new int[10];

        
        for (int d : digits) {
            count[d]++;
        }

        TreeSet<Integer> result = new TreeSet<>();

        // Generate
        for (int num = 100; num <= 998; num += 2) {
            int a = num / 100;
            int b = (num / 10) % 10;
            int c = num % 10;

            int[] need = new int[10];
            need[a]++;
            need[b]++;
            need[c]++;

            boolean valid = true;
            for (int i = 0; i < 10; i++) {
                if (need[i] > count[i]) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                result.add(num);
            }
        }

        // Convert set to array
        int[] ans = new int[result.size()];
        int i = 0;
        for (int val : result) {
            ans[i++] = val;
        }

        return ans;
    }
}
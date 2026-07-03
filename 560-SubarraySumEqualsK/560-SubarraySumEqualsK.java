// Last updated: 03/07/2026, 11:39:01
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        hash.put(0,1);
        int total = 0, count = 0;

        for (int n : nums) {
            total += n;

            if (hash.containsKey(total - k)) {
                count += hash.get(total - k);
            }

            hash.put(total, hash.getOrDefault(total, 0) + 1);
        }

        return count;      
    }
}
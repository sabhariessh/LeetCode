// Last updated: 18/08/2026, 15:58:35
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int[] d = new int[amount + 1];
4        Arrays.fill(d, amount + 1);
5        d[0] = 0;
6        for (int i = 1; i <= amount; i++) {
7            for (int coin : coins) {
8                if (coin <= i) {
9                    d[i] = Math.min(d[i], d[i - coin] + 1);
10                }
11            }
12        }
13        if (d[amount] == amount + 1) {
14            return -1;
15        }
16        return d[amount];
17    }
18}
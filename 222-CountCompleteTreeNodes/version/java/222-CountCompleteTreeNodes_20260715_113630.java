// Last updated: 15/07/2026, 11:36:30
1class Solution {
2    public List<List<Integer>> findWinners(int[][] matches) {
3        Set<Integer> zeroLoss = new HashSet<>();
4        Set<Integer> oneLoss = new HashSet<>();
5        Set<Integer> moreLoss = new HashSet<>();
6        for (int[] match : matches) {
7            int winner = match[0];
8            int loser = match[1];
9            if (!oneLoss.contains(winner) && !moreLoss.contains(winner)) {
10                zeroLoss.add(winner);
11            }
12            if (zeroLoss.contains(loser)) {
13                zeroLoss.remove(loser);
14                oneLoss.add(loser);
15            } else if (oneLoss.contains(loser)) {
16                oneLoss.remove(loser);
17                moreLoss.add(loser);
18            } else if (moreLoss.contains(loser)) {
19                continue;
20            } else {
21                oneLoss.add(loser);
22            }
23        }
24        List<List<Integer>> ans = new ArrayList<>();
25        ans.add(new ArrayList<>(zeroLoss));
26        ans.add(new ArrayList<>(oneLoss));
27        Collections.sort(ans.get(0));
28        Collections.sort(ans.get(1));
29        return ans;
30    }
31}
// Last updated: 10/08/2026, 11:51:07
1class Solution {
2    int vix = 0;
3    List<Integer> ans = new ArrayList<>();
4    private void dfs(TreeNode node, int[] V) {
5        if (node == null || (ans.size() != 0 && ans.get(0) == -1)) return;
6        if (node.val != V[vix++])
7            ans = new ArrayList<Integer>(Arrays.asList(-1));
8        else if (node.left != null && node.left.val != V[vix]) {
9            ans.add(node.val);
10            dfs(node.right, V);
11            dfs(node.left, V);
12        } else {
13            dfs(node.left, V);
14            dfs(node.right, V);
15        }
16    }
17    public List<Integer> flipMatchVoyage(TreeNode root, int[] V) {
18        dfs(root, V);
19        return ans;
20    }
21}
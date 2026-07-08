// Last updated: 08/07/2026, 13:46:12
1class Solution {
2    class Edge {
3        int nbr;
4        int wt;
5        Edge(int nbr, int wt) {
6            this.nbr = nbr;
7            this.wt = wt;
8        }
9    }
10    class Pair implements Comparable<Pair> {
11        int node;
12        int dist;
13        Pair(int node, int dist) {
14            this.node = node;
15            this.dist = dist;
16        }
17        public int compareTo(Pair p) {
18            return this.dist - p.dist;
19        }
20    }
21    public int networkDelayTime(int[][] times, int n, int k) {
22        ArrayList<Edge>[] graph = new ArrayList[n + 1];
23        for (int i = 0; i <= n; i++) {
24            graph[i] = new ArrayList<>();
25        }
26        for (int[] time : times) {
27            int src = time[0];
28            int dest = time[1];
29            int wt = time[2];
30            graph[src].add(new Edge(dest, wt));
31        }
32        int[] dist = new int[n + 1];
33        Arrays.fill(dist, Integer.MAX_VALUE);
34        PriorityQueue<Pair> pq = new PriorityQueue<>();
35        pq.add(new Pair(k, 0));
36        dist[k] = 0;
37        while (!pq.isEmpty()) {
38            Pair cur = pq.poll();
39
40            if (cur.dist > dist[cur.node])
41                continue;
42            for (Edge e : graph[cur.node]) {
43                int nd = dist[cur.node] + e.wt;
44                if (nd < dist[e.nbr]) {
45                    dist[e.nbr] = nd;
46                    pq.add(new Pair(e.nbr, nd));
47                }
48            }
49        }
50        int ans = 0;
51        for (int i = 1; i <= n; i++) {
52            if (dist[i] == Integer.MAX_VALUE)
53                return -1;
54            ans = Math.max(ans, dist[i]);
55        }
56        return ans;
57    }
58}
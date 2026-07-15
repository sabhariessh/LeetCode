// Last updated: 15/07/2026, 11:03:03
class Solution {
    class Edge {
        int nbr;
        int wt;
        Edge(int nbr, int wt) {
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    class Pair implements Comparable<Pair> {
        int node;
        int dist;
        Pair(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }
        public int compareTo(Pair p) {
            return this.dist - p.dist;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<Edge>[] graph = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] time : times) {
            int src = time[0];
            int dest = time[1];
            int wt = time[2];
            graph[src].add(new Edge(dest, wt));
        }
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(k, 0));
        dist[k] = 0;
        while (!pq.isEmpty()) {
            Pair cur = pq.poll();

            if (cur.dist > dist[cur.node])
                continue;
            for (Edge e : graph[cur.node]) {
                int nd = dist[cur.node] + e.wt;
                if (nd < dist[e.nbr]) {
                    dist[e.nbr] = nd;
                    pq.add(new Pair(e.nbr, nd));
                }
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE)
                return -1;
            ans = Math.max(ans, dist[i]);
        }
        return ans;
    }
}
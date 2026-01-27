import java.util.*;

class Solution {
    static class Pair {
        int node;
        long dist;
        Pair(int node, long dist) {
            this.node = node;
            this.dist = dist;
        }
    }

    static class Edge {
        int to;
        int w;
        Edge(int to, int w) {
            this.to = to;
            this.w = w;
        }
    }

    public int minCost(int n, int[][] edges) {
        List<Edge>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();

        for (int[] e : edges) {
            int u = e[0], v = e[1], w = e[2];

            // normal direction
            graph[u].add(new Edge(v, w));

            // reverse direction with doubled cost
            graph[v].add(new Edge(u, 2 * w));
        }

        long INF = Long.MAX_VALUE / 4;
        long[] dist = new long[n];
        Arrays.fill(dist, INF);

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Long.compare(a.dist, b.dist));

        dist[0] = 0;
        pq.add(new Pair(0, 0));

        while (!pq.isEmpty()) {
            Pair cur = pq.poll();
            int u = cur.node;
            long d = cur.dist;

            if (d != dist[u]) continue;

            for (Edge e : graph[u]) {
                int v = e.to;
                long nd = d + e.w;
                if (nd < dist[v]) {
                    dist[v] = nd;
                    pq.add(new Pair(v, nd));
                }
            }
        }

        return dist[n - 1] >= INF ? -1 : (int) dist[n - 1];
    }
}

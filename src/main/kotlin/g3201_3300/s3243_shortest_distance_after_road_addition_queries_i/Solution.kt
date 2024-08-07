package g3201_3300.s3243_shortest_distance_after_road_addition_queries_i

// #Medium #Array #Breadth_First_Search #Graph
// #2024_08_07_Time_313_ms_(97.06%)_Space_46.3_MB_(97.06%)

class Solution {
    fun shortestDistanceAfterQueries(n: Int, queries: Array<IntArray>): IntArray {
        val dist = IntArray(n)
        for (i in 0 until n) {
            dist[i] = i
        }
        val parent: Array<ArrayList<Int>> = Array(n) { ArrayList() }
        for (i in 0 until n) {
            parent[i] = ArrayList()
            if (i != n - 1) {
                parent[i].add(i + 1)
            }
        }
        val ans = IntArray(queries.size)
        for (i in queries.indices) {
            val u = queries[i][0]
            val v = queries[i][1]
            if (dist[v] > dist[u] + 1) {
                dist[v] = dist[u] + 1
                parent[u].add(v)
                updateDistance(v, dist, parent)
            } else {
                parent[u].add(v)
            }
            ans[i] = dist[n - 1]
        }
        return ans
    }

    fun updateDistance(par: Int, dist: IntArray, parent: Array<ArrayList<Int>>) {
        for (i in parent[par].indices) {
            val child = parent[par][i]
            if (dist[child] > dist[par] + 1) {
                dist[child] = dist[par] + 1
                updateDistance(child, dist, parent)
            }
        }
    }
}

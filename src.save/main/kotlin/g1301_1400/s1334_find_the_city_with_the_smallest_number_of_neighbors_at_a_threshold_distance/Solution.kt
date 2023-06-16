package g1301_1400.s1334_find_the_city_with_the_smallest_number_of_neighbors_at_a_threshold_distance

// #Medium #Dynamic_Programming #Graph #Shortest_Path
// #2023_06_06_Time_223_ms_(88.89%)_Space_37.5_MB_(77.78%)

class Solution {
    fun findTheCity(n: Int, edges: Array<IntArray>, maxDist: Int): Int {
        val graph = Array(n) { IntArray(n) }
        for (edge in edges) {
            graph[edge[0]][edge[1]] = edge[2]
            graph[edge[1]][edge[0]] = edge[2]
        }
        return fllowdWarshall(graph, n, maxDist)
    }

    private fun fllowdWarshall(graph: Array<IntArray>, n: Int, maxDist: Int): Int {
        val inf = 10001
        val dist = Array(n) { IntArray(n) }
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (i != j && graph[i][j] == 0) {
                    dist[i][j] = inf
                } else {
                    dist[i][j] = graph[i][j]
                }
            }
        }
        for (k in 0 until n) {
            for (i in 0 until n) {
                for (j in 0 until n) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j]
                    }
                }
            }
        }
        return getList(dist, n, maxDist)
    }

    private fun getList(dist: Array<IntArray>, n: Int, maxDist: Int): Int {
        val map = HashMap<Int, MutableList<Int>>()
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (!map.containsKey(i)) {
                    map[i] = ArrayList()
                    if (dist[i][j] <= maxDist && i != j) {
                        map[i]!!.add(j)
                    }
                } else if (map.containsKey(i) && dist[i][j] <= maxDist && i != j) {
                    map[i]!!.add(j)
                }
            }
        }
        var numOfEle = Int.MAX_VALUE
        var ans = 0
        for (i in 0 until n) {
            if (numOfEle >= map[i]!!.size) {
                numOfEle = Math.min(numOfEle, map[i]!!.size)
                ans = i
            }
        }
        return ans
    }
}

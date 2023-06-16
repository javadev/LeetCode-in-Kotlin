package g1701_1800.s1761_minimum_degree_of_a_connected_trio_in_a_graph

// #Hard #Graph
class Solution {
    fun minTrioDegree(n: Int, edges: Array<IntArray>): Int {
        val degrees = IntArray(n + 1)
        val adjMatrix = Array(n + 1) { IntArray(n + 1) }
        for (edge in edges) {
            adjMatrix[edge[0]][edge[1]] = 1
            adjMatrix[edge[1]][edge[0]] = 1
            degrees[edge[0]]++
            degrees[edge[1]]++
        }
        var minTrios = Int.MAX_VALUE
        for (i in 1..n) {
            for (j in i + 1..n) {
                if (adjMatrix[i][j] == 0) {
                    continue
                }
                for (k in j + 1..n) {
                    if (adjMatrix[j][k] == 0 || adjMatrix[i][k] == 0) {
                        continue
                    }
                    val trioDegree = degrees[i] + degrees[j] + degrees[k] - 6
                    minTrios = Math.min(minTrios, trioDegree)
                }
            }
        }
        return if (minTrios == Int.MAX_VALUE) -1 else minTrios
    }
}

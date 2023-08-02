package g2201_2300.s2285_maximum_total_importance_of_roads

// #Medium #Sorting #Greedy #Heap_Priority_Queue #Graph
// #2023_06_28_Time_947_ms_(100.00%)_Space_82.6_MB_(100.00%)

class Solution {
    fun maximumImportance(n: Int, roads: Array<IntArray>): Long {
        val degree = IntArray(n)
        var maxdegree = 0
        for (r in roads) {
            degree[r[0]]++
            degree[r[1]]++
            maxdegree = Math.max(maxdegree, Math.max(degree[r[0]], degree[r[1]]))
        }
        val rank: MutableMap<Int, Int> = HashMap()
        var i = n
        while (i > 0) {
            for (j in 0 until n) {
                if (degree[j] == maxdegree) {
                    rank[j] = i--
                    degree[j] = Int.MIN_VALUE
                }
            }
            maxdegree = 0
            for (d in degree) {
                maxdegree = Math.max(maxdegree, d)
            }
        }
        var res: Long = 0
        for (r in roads) {
            res += (rank[r[0]]!! + rank[r[1]]!!).toLong()
        }
        return res
    }
}

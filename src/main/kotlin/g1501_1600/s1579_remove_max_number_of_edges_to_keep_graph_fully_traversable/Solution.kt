package g1501_1600.s1579_remove_max_number_of_edges_to_keep_graph_fully_traversable

// #Hard #Graph #Union_Find #2023_06_14_Time_942_ms_(32.52%)_Space_92.5_MB_(100.00%)

class Solution {
    fun maxNumEdgesToRemove(n: Int, edges: Array<IntArray>): Int {
        edges.sortWith { a: IntArray, b: IntArray -> b[0] - a[0] }
        val alice = IntArray(n + 1)
        val rankAlice = IntArray(n + 1)
        val bob = IntArray(n + 1)
        val rankBob = IntArray(n + 1)
        for (i in 1..n) {
            alice[i] = i
            bob[i] = i
        }
        var countAlice = n
        var countBob = n
        var remove = 0
        for (edge in edges) {
            val type = edge[0]
            val u = edge[1]
            val v = edge[2]
            if (type == 1) {
                val a = union(u, v, alice, rankAlice)
                if (a) {
                    countAlice--
                } else {
                    remove++
                }
            } else if (type == 2) {
                val b = union(u, v, bob, rankBob)
                if (b) {
                    countBob--
                } else {
                    remove++
                }
            } else {
                val b = union(u, v, bob, rankBob)
                val a = union(u, v, alice, rankAlice)
                if (!a && !b) {
                    remove++
                }
                if (a) {
                    countAlice--
                }
                if (b) {
                    countBob--
                }
            }
        }
        return if (countAlice != 1 || countBob != 1) {
            -1
        } else {
            remove
        }
    }

    fun union(x: Int, y: Int, arr: IntArray, rank: IntArray): Boolean {
        val p1 = find(arr[x], arr)
        val p2 = find(arr[y], arr)
        if (p1 != p2) {
            if (rank[p1] > rank[p2]) {
                arr[p2] = p1
            } else if (rank[p1] < rank[p2]) {
                arr[p1] = p2
            } else {
                arr[p1] = p2
                rank[p2]++
            }
            return true
        }
        return false
    }

    fun find(x: Int, arr: IntArray): Int {
        if (arr[x] == x) {
            return x
        }
        val temp = find(arr[x], arr)
        arr[x] = temp
        return temp
    }
}

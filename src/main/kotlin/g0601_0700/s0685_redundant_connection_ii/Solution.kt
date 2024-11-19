package g0601_0700.s0685_redundant_connection_ii

// #Hard #Depth_First_Search #Breadth_First_Search #Graph #Union_Find
// #2023_02_17_Time_176_ms_(100.00%)_Space_38_MB_(33.33%)

class Solution {
    private lateinit var par: IntArray
    fun findRedundantDirectedConnection(edges: Array<IntArray>): IntArray {
        val n = edges.size
        val hasPar = IntArray(n + 1)
        for (edge in edges) {
            val v = edge[1]
            hasPar[v]++
        }
        par = IntArray(n + 1)
        for (i in par.indices) {
            par[i] = i
        }
        for (edge in edges) {
            val u = edge[0]
            val v = edge[1]
            if (hasPar[v] == 1) {
                val lu = find(u)
                val lv = find(v)
                if (lu != lv) {
                    par[lu] = lv
                } else {
                    return edge
                }
            }
        }
        for (edge in edges) {
            val u = edge[0]
            val v = edge[1]
            if (hasPar[v] > 1) {
                val lu = find(u)
                val lv = find(v)
                if (lu != lv) {
                    par[lu] = lv
                } else {
                    return edge
                }
            }
        }
        return IntArray(2)
    }

    private fun find(x: Int): Int {
        return if (par[x] == x) {
            x
        } else {
            find(par[x])
        }
    }
}

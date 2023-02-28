package g0601_0700.s0684_redundant_connection

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Union_Find
// #2023_02_17_Time_181_ms_(88.24%)_Space_35.4_MB_(100.00%)

class Solution {
    private lateinit var par: IntArray
    fun findRedundantConnection(edges: Array<IntArray>): IntArray {
        val ans = IntArray(2)
        val n = edges.size
        par = IntArray(n + 1)
        for (i in 0 until n) {
            par[i] = i
        }
        for (edge in edges) {
            val lx = find(edge[0])
            val ly = find(edge[1])
            if (lx != ly) {
                par[lx] = ly
            } else {
                ans[0] = edge[0]
                ans[1] = edge[1]
            }
        }
        return ans
    }

    private fun find(x: Int): Int {
        return if (par[x] == x) {
            x
        } else find(par[x])
    }
}

package g2501_2600.s2508_add_edges_to_make_degrees_of_all_nodes_even

// #Hard #Hash_Table #Graph
class Solution {
    fun isPossible(n: Int, edges: List<List<Int>>): Boolean {
        val g: Array<ArrayList<Int>?> = arrayOfNulls(n + 1)
        val oddList = ArrayList<Int>()
        for (i in 1..n) {
            g[i] = ArrayList()
        }
        for (edge in edges) {
            val x = edge[0]
            val y = edge[1]
            g[x]?.add(y)
            g[y]?.add(x)
        }
        for (i in 1..n) {
            if (g[i]!!.size % 2 == 1) {
                oddList.add(i)
            }
        }
        val size = oddList.size
        if (size == 0) {
            return true
        }
        if (size == 1 || size == 3 || size > 4) {
            return false
        }
        if (size == 2) {
            val x = oddList[0]
            val y = oddList[1]
            if (isNotConnected(x, y, g)) {
                return true
            }
            for (i in 1..n) {
                if (isNotConnected(i, x, g) && isNotConnected(i, y, g)) {
                    return true
                }
            }
            return false
        }
        val a = oddList[0]
        val b = oddList[1]
        val c = oddList[2]
        val d = oddList[3]
        if (isNotConnected(a, b, g) && isNotConnected(c, d, g)) {
            return true
        }
        return if (isNotConnected(a, c, g) && isNotConnected(b, d, g)) {
            true
        } else isNotConnected(a, d, g) && isNotConnected(b, c, g)
    }

    private fun isNotConnected(x: Int, y: Int, g: Array<ArrayList<Int>?>): Boolean {
        return !g[x]?.contains(y)!!
    }
}

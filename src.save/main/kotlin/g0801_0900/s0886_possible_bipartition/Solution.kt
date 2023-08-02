package g0801_0900.s0886_possible_bipartition

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Union_Find
// #Graph_Theory_I_Day_14_Graph_Theory #2023_04_08_Time_397_ms_(100.00%)_Space_51.3_MB_(100.00%)

class Solution {
    fun possibleBipartition(n: Int, dislikes: Array<IntArray>): Boolean {
        // build graph
        val g = Graph(n)
        for (dislike in dislikes) {
            g.addEdge(dislike[0] - 1, dislike[1] - 1)
        }
        val marked = BooleanArray(n)
        val colors = BooleanArray(n)
        for (v in 0 until n) {
            if (!marked[v] && !checkBipartiteDFS(g, marked, colors, v)) {
                // No need to run on other connected components if one component has failed.
                return false
            }
        }
        return true
    }

    private fun checkBipartiteDFS(g: Graph, marked: BooleanArray, colors: BooleanArray, v: Int): Boolean {
        marked[v] = true
        for (w in g.adj(v)) {
            if (!marked[w]) {
                colors[w] = !colors[v]
                if (!checkBipartiteDFS(g, marked, colors, w)) {
                    // this is to break for other neighbours
                    return false
                }
            } else if (colors[v] == colors[w]) {
                return false
            }
        }
        return true
    }

    private class Graph(v: Int) {
        private val adj: Array<ArrayList<Int>?>

        init {
            adj = arrayOfNulls(v)
            for (i in 0 until v) {
                adj[i] = ArrayList<Int>()
            }
        }

        fun addEdge(v: Int, w: Int) {
            adj[v]!!.add(w)
            adj[w]!!.add(v)
        }

        fun adj(v: Int): List<Int> {
            return adj[v]!!
        }
    }
}

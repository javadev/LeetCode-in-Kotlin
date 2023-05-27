package g1001_1100.s1042_flower_planting_with_no_adjacent

// #Medium #Depth_First_Search #Breadth_First_Search #Graph
// #2023_05_27_Time_396_ms_(85.71%)_Space_82.5_MB_(42.86%)

class Solution {
    private lateinit var graph: Array<ArrayList<Int>?>
    private lateinit var color: IntArray
    private lateinit var visited: BooleanArray
    fun gardenNoAdj(n: Int, paths: Array<IntArray>): IntArray {
        buildGraph(n, paths)
        color = IntArray(n)
        visited = BooleanArray(n)
        for (i in 0 until n) {
            if (!visited[i]) {
                dfs(i)
            }
        }
        return color
    }

    private fun dfs(at: Int) {
        visited[at] = true
        var used = 0
        for (to in graph[at]!!) {
            if (color[to] != 0) {
                used = used or (1 shl color[to] - 1)
            }
        }

        // use available color
        for (i in 0..3) {
            if (used and (1 shl i) == 0) {
                color[at] = i + 1
                break
            }
        }
    }

    private fun buildGraph(n: Int, paths: Array<IntArray>) {
        graph = arrayOfNulls(n)
        for (i in 0 until n) {
            graph[i] = ArrayList()
        }
        for (path in paths) {
            val u = path[0] - 1
            val v = path[1] - 1
            graph[u]!!.add(v)
            graph[v]!!.add(u)
        }
    }
}

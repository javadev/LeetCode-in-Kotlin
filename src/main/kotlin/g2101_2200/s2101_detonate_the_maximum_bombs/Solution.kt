package g2101_2200.s2101_detonate_the_maximum_bombs

// #Medium #Array #Math #Depth_First_Search #Breadth_First_Search #Graph #Geometry
class Solution {
    fun maximumDetonation(bombs: Array<IntArray>): Int {
        val n = bombs.size
        val graph: Array<MutableList<Int>?> = arrayOfNulls(n)
        for (i in 0 until n) {
            graph[i] = ArrayList()
        }
        for (i in 0 until n) {
            for (j in i + 1 until n) {
                val dx = bombs[i][0] - bombs[j][0].toDouble()
                val dy = bombs[i][1] - bombs[j][1].toDouble()
                val r1 = bombs[i][2].toDouble()
                val r2 = bombs[j][2].toDouble()
                val dist = dx * dx + dy * dy
                if (dist <= r1 * r1) {
                    graph[i]?.add(j)
                }
                if (dist <= r2 * r2) {
                    graph[j]?.add(i)
                }
            }
        }
        val visited = BooleanArray(n)
        var ans = 0
        for (i in 0 until n) {
            ans = Math.max(ans, dfs(graph, i, visited))
            if (ans == n) {
                return ans
            }
            visited.fill(false)
        }
        return ans
    }

    private fun dfs(graph: Array<MutableList<Int>?>, i: Int, visited: BooleanArray): Int {
        var cc = 0
        if (visited[i]) {
            return 0
        }
        visited[i] = true
        for (neigh in graph[i]!!) {
            cc += dfs(graph, neigh, visited)
        }
        return cc + 1
    }
}

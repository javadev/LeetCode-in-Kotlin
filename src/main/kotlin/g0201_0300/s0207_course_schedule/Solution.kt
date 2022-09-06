package g0201_0300.s0207_course_schedule

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Depth_First_Search
// #Breadth_First_Search #Graph #Topological_Sort
// #2022_06_28_Time_3_ms_(97.58%)_Space_48.2_MB_(49.51%)
class Solution {
    fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
        val adj: Array<ArrayList<Int>?> = arrayOfNulls<ArrayList<Int>>(numCourses)
        for (i in 0 until numCourses) {
            adj[i] = ArrayList()
        }
        for (pre in prerequisites) {
            adj[pre[1]]?.add(pre[0])
        }
        val colors = IntArray(numCourses)
        for (i in 0 until numCourses) {
            if (colors[i] == WHITE && !adj[i]?.isEmpty()!! && hasCycle(adj, i, colors)) {
                return false
            }
        }
        return true
    }

    private fun hasCycle(adj: Array<ArrayList<Int>?>, node: Int, colors: IntArray): Boolean {
        colors[node] = GRAY
        for (nei in adj[node]!!) {
            if (colors[nei] == GRAY) {
                return true
            }
            if (colors[nei] == WHITE && hasCycle(adj, nei, colors)) {
                return true
            }
        }
        colors[node] = BLACK
        return false
    }

    companion object {
        private const val WHITE = 0
        private const val GRAY = 1
        private const val BLACK = 2
    }
}

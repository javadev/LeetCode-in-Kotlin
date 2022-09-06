package g0201_0300.s0210_course_schedule_ii

// #Medium #Top_Interview_Questions #Depth_First_Search #Breadth_First_Search #Graph
// #Topological_Sort #Level_2_Day_11_Graph/BFS/DFS
// #2022_06_28_Time_13_ms_(35.17%)_Space_50.7_MB_(22.84%)
class Solution {
    fun findOrder(numCourses: Int, prerequisites: Array<IntArray>): IntArray {
        val graph: MutableMap<Int, MutableList<Int>> = HashMap()
        for (i in 0 until numCourses) {
            graph[i] = ArrayList()
        }
        for (classes in prerequisites) {
            graph[classes[0]]!!.add(classes[1])
        }
        val output: MutableList<Int> = ArrayList()
        val visited: MutableMap<Int, Boolean> = HashMap()
        for (c in graph.keys) {
            if (dfs(c, graph, visited, output)) {
                return IntArray(0)
            }
        }
        val res = IntArray(output.size)
        for (i in output.indices) {
            res[i] = output[i]
        }
        return res
    }

    private fun dfs(
        course: Int,
        graph: Map<Int, MutableList<Int>>,
        visited: MutableMap<Int, Boolean>,
        output: MutableList<Int>
    ): Boolean {
        if (visited.containsKey(course)) {
            return visited[course]!!
        }
        visited[course] = true
        for (c in graph[course]!!) {
            if (dfs(c, graph, visited, output)) {
                return true
            }
        }
        visited[course] = false
        output.add(course)
        return false
    }
}

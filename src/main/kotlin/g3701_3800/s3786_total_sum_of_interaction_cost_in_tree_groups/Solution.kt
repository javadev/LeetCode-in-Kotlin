package g3701_3800.s3786_total_sum_of_interaction_cost_in_tree_groups

// #Hard #Array #Depth_First_Search #Tree #Senior_Staff #Weekly_Contest_481
// #2026_05_22_Time_82_ms_(90.67%)_Space_296.78_MB_(21.33%)

class Solution {
    private var totalCost: Long = 0
    private lateinit var counts: Array<IntArray>
    private lateinit var totalInGroup: IntArray
    private lateinit var adj: MutableList<MutableList<Int>>

    fun interactionCosts(n: Int, edges: Array<IntArray>, group: IntArray): Long {
        adj = ArrayList<MutableList<Int>>()
        for (i in 0..<n) {
            adj.add(ArrayList<Int>())
        }
        for (edge in edges) {
            adj[edge[0]].add(edge[1])
            adj[edge[1]].add(edge[0])
        }
        totalInGroup = IntArray(21)
        for (g in group) {
            totalInGroup[g]++
        }
        counts = Array<IntArray>(n) { IntArray(21) }
        dfs(0, -1, group)
        return totalCost
    }

    private fun dfs(u: Int, p: Int, group: IntArray) {
        counts[u][group[u]] = 1
        for (v in adj[u]) {
            if (v == p) {
                continue
            }
            dfs(v, u, group)
            for (g in 1..20) {
                if (totalInGroup[g] < 2) {
                    continue
                }
                val inSubtree = counts[v][g].toLong()
                val outsideSubtree = totalInGroup[g] - inSubtree
                totalCost += inSubtree * outsideSubtree
                counts[u][g] += counts[v][g]
            }
        }
    }
}

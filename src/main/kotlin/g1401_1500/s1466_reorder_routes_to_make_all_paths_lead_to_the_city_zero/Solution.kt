package g1401_1500.s1466_reorder_routes_to_make_all_paths_lead_to_the_city_zero

// #Medium #Depth_First_Search #Breadth_First_Search #Graph
// #Graph_Theory_I_Day_10_Standard_Traversal
// #2023_06_13_Time_718_ms_(100.00%)_Space_61.9_MB_(100.00%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun minReorder(n: Int, connections: Array<IntArray>): Int {
        val q: Queue<Int> = LinkedList()
        val vis = BooleanArray(n)
        val adj: MutableList<MutableList<Int>> = ArrayList()
        var count = 0
        for (i in 0 until n) {
            adj.add(ArrayList())
        }
        for (tup in connections) {
            adj[tup[0]].add(tup[1])
            adj[tup[1]].add(-tup[0])
        }
        q.offer(0)
        vis[0] = true
        while (!q.isEmpty()) {
            val node = q.poll()
            for (it in adj[node]) {
                if (!vis[Math.abs(it)]) {
                    vis[Math.abs(it)] = true
                    if (it > 0) {
                        count++
                    }
                    q.offer(Math.abs(it))
                }
            }
        }
        return count
    }
}

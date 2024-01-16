package g2901_3000.s2959_number_of_possible_sets_of_closing_branches

// #Hard #Bit_Manipulation #Heap_Priority_Queue #Graph #Enumeration #Shortest_Path
// #2024_01_16_Time_231_ms_(87.50%)_Space_39.9_MB_(75.00%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    private fun get(n: Int, maxDis: Int, mask: Int, al: List<MutableList<IntArray>>): Int {
        var nodes = 0
        val m = BooleanArray(n)
        for (i in 0 until n) {
            val `val` = mask and (1 shl i)
            if (`val` > 0) {
                m[i] = true
                nodes++
            }
        }
        if (nodes == n) {
            return 1
        }
        for (startVertex in 0 until n) {
            if (m[startVertex]) {
                continue
            }
            val q: Queue<IntArray> = LinkedList()
            q.add(intArrayOf(startVertex, 0))
            val dis = IntArray(n)
            dis.fill(Int.MAX_VALUE)
            dis[startVertex] = 0
            var nodeCount = 1
            while (!q.isEmpty()) {
                val curr = q.poll()
                for (adj in al[curr[0]]) {
                    if (!m[adj[0]] && curr[1] + adj[1] <= dis[adj[0]]) {
                        if (dis[adj[0]] == Int.MAX_VALUE) {
                            nodeCount++
                        }
                        dis[adj[0]] = curr[1] + adj[1]
                        q.add(intArrayOf(adj[0], dis[adj[0]]))
                    }
                }
            }
            for (i in 0 until n) {
                if (!m[i] && dis[i] > maxDis) {
                    return 0
                }
            }
            if (nodes != n - nodeCount) {
                return 0
            }
        }
        return 1
    }

    private fun solve(n: Int, maxDis: Int, al: List<MutableList<IntArray>>): Int {
        var res = 0
        for (i in 0 until (1 shl n)) {
            res += get(n, maxDis, i, al)
        }
        return res
    }

    fun numberOfSets(n: Int, maxDistance: Int, roads: Array<IntArray>): Int {
        val al: MutableList<MutableList<IntArray>> = ArrayList()
        for (i in 0 until n) {
            al.add(ArrayList())
        }
        for (edge in roads) {
            al[edge[0]].add(intArrayOf(edge[1], edge[2]))
            al[edge[1]].add(intArrayOf(edge[0], edge[2]))
        }
        return solve(n, maxDistance, al)
    }
}

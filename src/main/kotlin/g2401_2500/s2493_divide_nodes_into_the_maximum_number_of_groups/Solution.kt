package g2401_2500.s2493_divide_nodes_into_the_maximum_number_of_groups

import java.util.LinkedList
import java.util.Queue

// #Hard #Breadth_First_Search #Graph #Union_Find
class Solution {
    fun magnificentSets(n: Int, edges: Array<IntArray>): Int {
        val adj: MutableList<MutableList<Int>> = ArrayList()
        val visited = IntArray(n + 1)
        visited.fill(-1)
        for (i in 0..n) {
            adj.add(ArrayList())
        }
        for (edge in edges) {
            adj[edge[0]].add(edge[1])
            adj[edge[1]].add(edge[0])
        }
        val comp = IntArray(n + 1)
        var count = -1
        var ans = 0
        for (i in 1..n) {
            if (visited[i] == -1) {
                count++
                comp[count] = bfs(i, adj, visited, count, n)
                if (comp[count] == -1) {
                    return -1
                }
            } else {
                comp[visited[i]] = Math.max(comp[visited[i]], bfs(i, adj, visited, visited[i], n))
            }
        }
        for (group in comp) {
            ans += group
        }
        return ans
    }

    private fun bfs(start: Int, adj: List<MutableList<Int>>, visited: IntArray, count: Int, n: Int): Int {
        val q: Queue<Int> = LinkedList()
        visited[start] = count
        var ans = 1
        val group = IntArray(n + 1)
        q.add(start)
        group[start] = 1
        while (!q.isEmpty()) {
            val node = q.remove()
            for (adjN in adj[node]) {
                if (group[adjN] == 0) {
                    visited[adjN] = count
                    group[adjN] = group[node] + 1
                    q.add(adjN)
                    ans = Math.max(ans, group[adjN])
                } else if (Math.abs(group[adjN] - group[node]) != 1) {
                    return -1
                }
            }
        }
        return ans
    }
}

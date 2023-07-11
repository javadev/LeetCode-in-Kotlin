package g2501_2600.s2581_count_number_of_possible_root_nodes

// #Hard #Hash_Table #Dynamic_Programming #Tree #Depth_First_Search
// #2023_07_11_Time_1352_ms_(100.00%)_Space_138.7_MB_(100.00%)

import java.util.ArrayList
import java.util.HashSet

@Suppress("NAME_SHADOWING")
class Solution {
    private lateinit var parents: IntArray
    private lateinit var graph: Array<MutableList<Int>?>
    private lateinit var guess: Array<HashSet<Int>?>
    private var ans = 0

    fun rootCount(edges: Array<IntArray>, guesses: Array<IntArray>, k: Int): Int {
        val n = edges.size + 1
        graph = arrayOfNulls(n)
        guess = arrayOfNulls(n)
        for (i in 0 until n) {
            graph[i] = ArrayList()
            guess[i] = HashSet<Int>()
        }
        // Create tree
        for (i in edges.indices) {
            graph[edges[i][0]]!!.add(edges[i][1])
            graph[edges[i][1]]!!.add(edges[i][0])
        }
        // Create guess array
        for (i in guesses.indices) {
            guess[guesses[i][0]]!!.add(guesses[i][1])
        }
        parents = IntArray(n)
        fill(0, -1)
        var c = 0
        for (i in 1 until n) {
            if (guess[parents[i]]!!.contains(i)) c++
        }
        if (c >= k) ans++
        for (i in graph[0]!!) dfs(i, 0, c, k)
        return ans
    }

    // Fill the parent array
    private fun fill(v: Int, p: Int) {
        parents[v] = p
        for (child in graph[v]!!) {
            if (child == p) continue
            fill(child, v)
        }
    }

    // Use DFS to make all nodes as root one by one
    private fun dfs(v: Int, p: Int, c: Int, k: Int) {
        var c = c
        if (guess[p]!!.contains(v)) c--
        if (guess[v]!!.contains(p)) c++
        if (c >= k) ans++
        for (child in graph[v]!!) if (child != p) dfs(child, v, c, k)
    }
}

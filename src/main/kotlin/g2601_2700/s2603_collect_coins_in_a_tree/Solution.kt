package g2601_2700.s2603_collect_coins_in_a_tree

// #Hard #Array #Tree #Graph #Topological_Sort
// #2023_07_13_Time_986_ms_(100.00%)_Space_67.7_MB_(100.00%)

import java.util.ArrayList

class Solution {
    private lateinit var coins: IntArray
    private var n = 0
    private lateinit var graph: Array<ArrayList<Int>?>
    private var sum = 0
    private var ret = 0
    fun collectTheCoins(coins: IntArray, edges: Array<IntArray>): Int {
        n = coins.size
        this.coins = coins
        graph = arrayOfNulls(n)
        for (i in 0 until n) {
            graph[i] = ArrayList()
        }
        for (edge in edges) {
            graph[edge[0]]!!.add(edge[1])
            graph[edge[1]]!!.add(edge[0])
        }
        for (coin in coins) {
            sum += coin
        }
        dfs(0, -1)
        return Math.max(2 * (ret - 1), 0)
    }

    private fun dfs(node: Int, pre: Int): Int {
        var cnt = 0
        var s = 0
        for (nn in graph[node]!!) {
            if (nn != pre) {
                val r = dfs(nn, node)
                if (r - coins[nn] > 0) cnt++
                s += r
            }
        }
        if (pre != -1) {
            if (sum - s - coins[node] - coins[pre] > 0) {
                cnt++
            }
        }
        if (cnt >= 2) {
            ret++
        }
        return s + coins[node]
    }
}

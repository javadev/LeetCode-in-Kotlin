package g2901_3000.s2920_maximum_points_after_collecting_coins_from_all_nodes

// #Hard #Array #Dynamic_Programming #Depth_First_Search #Tree #Bit_Manipulation
// #2024_05_09_Time_1007_ms_(100.00%)_Space_149.4_MB_(100.00%)

import kotlin.math.max

class Solution {
    private lateinit var adjList: Array<MutableList<Int>>
    private lateinit var coins: IntArray
    private var k = 0
    private lateinit var dp: Array<IntArray>

    private fun init(edges: Array<IntArray>, coins: IntArray, k: Int) {
        val n = coins.size
        adjList = Array(n) { ArrayList() }
        for (edge in edges) {
            val u = edge[0]
            val v = edge[1]
            adjList[u].add(v)
            adjList[v].add(u)
        }
        this.coins = coins
        this.k = k
        dp = Array(n) { IntArray(14) }
        for (v in 0 until n) {
            for (numOfWay2Parents in 0..13) {
                dp[v][numOfWay2Parents] = -1
            }
        }
    }

    private fun rec(v: Int, p: Int, numOfWay2Parents: Int): Int {
        if (numOfWay2Parents >= 14) {
            return 0
        }
        if (dp[v][numOfWay2Parents] == -1) {
            val coinsV = coins[v] / (1 shl numOfWay2Parents)
            var s0 = coinsV - k
            var s1 = coinsV / 2
            for (child in adjList[v]) {
                if (child != p) {
                    s0 += rec(child, v, numOfWay2Parents)
                    s1 += rec(child, v, numOfWay2Parents + 1)
                }
            }
            dp[v][numOfWay2Parents] = max(s0, s1)
        }
        return dp[v][numOfWay2Parents]
    }

    fun maximumPoints(edges: Array<IntArray>, coins: IntArray, k: Int): Int {
        init(edges, coins, k)
        return rec(0, -1, 0)
    }
}

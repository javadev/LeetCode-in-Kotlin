package g2901_3000.s2977_minimum_cost_to_convert_string_ii

// #Hard #Array #String #Dynamic_Programming #Graph #Trie #Shortest_Path
// #2024_01_19_Time_697_ms_(100.00%)_Space_51.2_MB_(64.29%)

import kotlin.math.min

class Solution {
    fun minimumCost(
        source: String,
        target: String,
        original: Array<String>,
        changed: Array<String>,
        cost: IntArray,
    ): Long {
        val index = HashMap<String, Int>()
        for (o in original) {
            if (!index.containsKey(o)) {
                index[o] = index.size
            }
        }
        for (c in changed) {
            if (!index.containsKey(c)) {
                index[c] = index.size
            }
        }
        val dis = Array(index.size) { LongArray(index.size) }
        for (i in dis.indices) {
            dis[i].fill(Long.MAX_VALUE)
            dis[i][i] = 0
        }
        for (i in cost.indices) {
            dis[index[original[i]]!!][index[changed[i]]!!] =
                min(dis[index[original[i]]!!][index[changed[i]]!!], cost[i].toLong())
        }
        for (k in dis.indices) {
            for (i in dis.indices) {
                if (dis[i][k] < Long.MAX_VALUE) {
                    for (j in dis.indices) {
                        if (dis[k][j] < Long.MAX_VALUE) {
                            dis[i][j] = min(dis[i][j], (dis[i][k] + dis[k][j]))
                        }
                    }
                }
            }
        }
        val set = HashSet<Int>()
        for (o in original) {
            set.add(o.length)
        }
        val dp = LongArray(target.length + 1)
        dp.fill(Long.MAX_VALUE)
        dp[0] = 0L
        for (i in target.indices) {
            if (dp[i] == Long.MAX_VALUE) {
                continue
            }
            if (target[i] == source[i]) {
                dp[i + 1] = min(dp[i + 1], dp[i])
            }
            for (t in set) {
                if (i + t >= dp.size) {
                    continue
                }
                val c1 = index.getOrDefault(source.substring(i, i + t), -1)
                val c2 = index.getOrDefault(target.substring(i, i + t), -1)
                if (c1 >= 0 && c2 >= 0 && dis[c1][c2] < Long.MAX_VALUE) {
                    dp[i + t] = min(dp[i + t], (dp[i] + dis[c1][c2]))
                }
            }
        }
        return if (dp[dp.size - 1] == Long.MAX_VALUE) -1L else dp[dp.size - 1]
    }
}

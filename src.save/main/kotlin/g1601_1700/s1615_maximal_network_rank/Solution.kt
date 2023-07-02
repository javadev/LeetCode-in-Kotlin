package g1601_1700.s1615_maximal_network_rank

// #Medium #Graph #Graph_Theory_I_Day_14_Graph_Theory
// #2023_06_15_Time_282_ms_(100.00%)_Space_46.9_MB_(71.43%)

class Solution {
    fun maximalNetworkRank(n: Int, roads: Array<IntArray>): Int {
        val degrees = IntArray(n)
        val connected = BooleanArray(40000)
        for (r in roads) {
            degrees[r[0]]++
            degrees[r[1]]++
            connected[(r[0] + 101) * (r[1] + 101) - 1] = true
        }
        var max = 0
        for (i in 0 until n) {
            for (j in i + 1 until n) {
                max = if (connected[(i + 101) * (j + 101) - 1]) {
                    max.coerceAtLeast(degrees[i] + degrees[j] - 1)
                } else {
                    max.coerceAtLeast(degrees[i] + degrees[j])
                }
            }
        }
        return max
    }
}

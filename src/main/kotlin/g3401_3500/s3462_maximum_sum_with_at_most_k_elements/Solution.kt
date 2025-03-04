package g3401_3500.s3462_maximum_sum_with_at_most_k_elements

// #Medium #Array #Sorting #Greedy #Matrix #Heap_Priority_Queue
// #2025_02_25_Time_139_ms_(100.00%)_Space_88.84_MB_(79.31%)

class Solution {
    fun maxSum(grid: Array<IntArray>, limits: IntArray, k: Int): Long {
        var l = 0
        for (i in limits.indices) {
            l += limits[i]
        }
        val dp = IntArray(l)
        var a = 0
        for (i in grid.indices) {
            val lim = limits[i]
            grid[i].sort()
            for (j in grid[i].size - lim..<grid[i].size) {
                dp[a] = grid[i][j]
                a++
            }
        }
        dp.sort()
        var sum = 0L
        for (i in l - 1 downTo l - k) {
            sum += dp[i].toLong()
        }
        return sum
    }
}

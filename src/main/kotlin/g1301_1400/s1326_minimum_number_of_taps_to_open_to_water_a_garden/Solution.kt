package g1301_1400.s1326_minimum_number_of_taps_to_open_to_water_a_garden

// #Hard #Array #Dynamic_Programming #Greedy
// #2023_06_06_Time_189_ms_(100.00%)_Space_38.5_MB_(42.86%)

class Solution {
    fun minTaps(n: Int, ranges: IntArray): Int {
        if (n == 0 || ranges.size == 0) {
            return if (n == 0) 0 else -1
        }
        val dp = IntArray(n + 1)
        var nxtLargest = 0
        var current = 0
        var amount = 0
        for (i in ranges.indices) {
            if (ranges[i] > 0) {
                val ind = Math.max(0, i - ranges[i])
                dp[ind] = Math.max(dp[ind], i + ranges[i])
            }
        }
        for (i in 0..n) {
            nxtLargest = Math.max(nxtLargest, dp[i])
            if (i == current && i < n) {
                current = nxtLargest
                amount++
            }
            if (current < i) {
                return -1
            }
        }
        return amount
    }
}

package g3501_3600.s3560_find_minimum_log_transportation_cost

// #Easy #2025_05_25_Time_0_ms_(100.00%)_Space_40.46_MB_(100.00%)

class Solution {
    fun minCuttingCost(n: Int, m: Int, k: Int): Long {
        if (n == 0 || m == 0 || k == 0) {
            return 0
        }
        var ans: Long = 0
        if (m <= k && n <= k) {
            return 0
        }
        if (m > k && n <= k) {
            ans += (m - k).toLong() * k
        }
        if (n > k && m <= k) {
            ans += (n - k).toLong() * k
        }
        return ans
    }
}

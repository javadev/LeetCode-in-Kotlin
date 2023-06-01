package g0601_0700.s0668_kth_smallest_number_in_multiplication_table

// #Hard #Math #Binary_Search #2023_02_14_Time_151_ms_(100.00%)_Space_33_MB_(50.00%)

class Solution {
    fun findKthNumber(m: Int, n: Int, k: Int): Int {
        var lo = 1
        var hi = m * n
        while (lo < hi) {
            val mid = lo + (hi - lo) / 2
            var col = n
            var row = 1
            var count = 0
            while (row <= m && col >= 1) {
                val `val` = row * col
                if (`val` > mid) {
                    col--
                } else {
                    count += col
                    row++
                }
            }
            if (count < k) {
                lo = mid + 1
            } else {
                hi = mid
            }
        }
        return lo
    }
}

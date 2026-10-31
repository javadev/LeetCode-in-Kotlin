package g3701_3800.s3747_count_distinct_integers_after_removing_zeros

// #Medium #Dynamic_Programming #Math #Staff #Weekly_Contest_476
// #2026_04_26_Time_1_ms_(100.00%)_Space_42.72_MB_(79.66%)

class Solution {
    fun countDistinct(n: Long): Long {
        val digits = n.toString()
        val m = digits.length
        val power9 = LongArray(m + 1)
        power9[0] = 1
        for (i in 1..m) {
            power9[i] = power9[i - 1] * 9
        }
        var total: Long = 0
        for (length in 1..<m) {
            total += power9[length]
        }
        for (idx in 0..<m) {
            val d = digits[idx].code - '0'.code
            if (d == 0) {
                return total
            }
            total += (d - 1) * power9[m - idx - 1]
        }
        return total + 1
    }
}

package g3901_4000.s3971_maximum_total_value

import kotlin.math.max

// #Hard #Array #Math #Greedy #Binary_Search #Senior_Staff #Weekly_Contest_507
// #2026_11_03_Time_19_ms_(100.00%)_Space_106.00_MB_(7.14%)

class Solution {
    fun maxTotalValue(value: IntArray, decay: IntArray, m: Int): Int {
        if (getCount(value, decay, m, 0) < m) {
            return getSum(value, decay, m.toLong(), 0)
        }
        var max = 0
        for (x in value) {
            max = max(max, x)
        }
        var left = 1
        var right = max
        while (left <= right) {
            val mid = left + right shr 1
            if (getCount(value, decay, m, mid) >= m) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return getSum(value, decay, m.toLong(), right)
    }

    private fun getCount(value: IntArray, decay: IntArray, m: Int, limit: Int): Long {
        val n = value.size
        var count: Long = 0
        for (i in 0..<n) {
            val x = value[i]
            val d = decay[i]
            if (x >= limit) {
                count += ((x - limit) / d + 1).toLong()
            }
            if (count >= m) {
                break
            }
        }
        return count
    }

    private fun getSum(value: IntArray, decay: IntArray, m: Long, limit: Int): Int {
        var m = m
        val n = value.size
        var sum: Long = 0
        for (i in 0..<n) {
            val x = value[i]
            val d = decay[i]
            if (x <= limit) {
                continue
            }
            val c = (x - limit - 1) / d + 1L
            sum += c * (x + x - (c - 1) * d)
            m -= c
        }
        sum = sum shr 1
        sum += m * limit
        return (sum % MOD).toInt()
    }

    companion object {
        private val MOD = 1e9.toInt() + 7
    }
}

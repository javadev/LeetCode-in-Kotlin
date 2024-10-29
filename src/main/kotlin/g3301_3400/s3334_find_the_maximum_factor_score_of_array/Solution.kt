package g3301_3400.s3334_find_the_maximum_factor_score_of_array

// #Medium #Array #Math #Number_Theory #2024_10_29_Time_4_ms_(95.83%)_Space_37.8_MB_(54.17%)

import kotlin.math.max

class Solution {
    fun maxScore(nums: IntArray): Long {
        val n = nums.size
        if (n == 1) {
            return nums[0].toLong() * nums[0]
        }
        val lToR = Array<LongArray?>(n) { LongArray(2) }
        val rToL = Array<LongArray?>(n) { LongArray(2) }
        for (i in 0 until n) {
            if (i == 0) {
                lToR[i]!![1] = nums[i].toLong()
                lToR[i]!![0] = lToR[i]!![1]
                rToL[n - i - 1]!![1] = nums[n - i - 1].toLong()
                rToL[n - i - 1]!![0] = rToL[n - i - 1]!![1]
            } else {
                rToL[n - i - 1]!![0] = gcd(nums[n - i - 1].toLong(), rToL[n - i]!![0])
                lToR[i]!![0] = gcd(nums[i].toLong(), lToR[i - 1]!![0])

                rToL[n - i - 1]!![1] = lcm(nums[n - i - 1].toLong(), rToL[n - i]!![1])
                lToR[i]!![1] = lcm(nums[i].toLong(), lToR[i - 1]!![1])
            }
        }
        var max: Long = 0
        for (i in 0 until n) {
            val gcd = if (i == 0) rToL[i + 1]!![0] else getLong(i, n, lToR, rToL)
            max = max(max, (gcd * (if (i == 0) rToL[i + 1]!![1] else getaLong(i, n, lToR, rToL))))
        }
        return max(max, (rToL[0]!![0] * rToL[0]!![1]))
    }

    private fun getaLong(i: Int, n: Int, lToR: Array<LongArray?>, rToL: Array<LongArray?>): Long {
        return if (i == n - 1) lToR[i - 1]!![1] else lcm(rToL[i + 1]!![1], lToR[i - 1]!![1])
    }

    private fun getLong(i: Int, n: Int, lToR: Array<LongArray?>, rToL: Array<LongArray?>): Long {
        return if (i == n - 1) lToR[i - 1]!![0] else gcd(rToL[i + 1]!![0], lToR[i - 1]!![0])
    }

    private fun gcd(a: Long, b: Long): Long {
        if (b == 0L) {
            return a
        }
        return gcd(b, a % b)
    }

    private fun lcm(a: Long, b: Long): Long {
        return a * b / gcd(a, b)
    }
}

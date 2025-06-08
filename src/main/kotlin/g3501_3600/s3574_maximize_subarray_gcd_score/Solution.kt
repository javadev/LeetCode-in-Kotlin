package g3501_3600.s3574_maximize_subarray_gcd_score

// #Hard #2025_06_08_Time_269_ms_(100.00%)_Space_63.86_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun maxGCDScore(nums: IntArray, k: Int): Long {
        var ans: Long = 0
        val n = nums.size
        for (i in 0..<n) {
            var countGCD: Long = 0
            var oddCount: Long = 0
            var ongoingGCD: Long = 0
            for (j in i..<n) {
                val currentGCD = gcd(ongoingGCD, nums[j].toLong())
                if (currentGCD != ongoingGCD) {
                    ongoingGCD = currentGCD
                    countGCD = 1
                } else if (nums[j].toLong() == ongoingGCD) {
                    countGCD++
                }
                if (nums[j] % 2 != 0) {
                    oddCount++
                }
                val len = j - i + 1
                var res = ongoingGCD * len
                if (ongoingGCD % 2 != 0L) {
                    if (k >= oddCount) {
                        res *= 2L
                    }
                } else if (k >= countGCD) {
                    res *= 2L
                }
                ans = max(ans, res)
            }
        }
        return ans
    }

    private fun gcd(a: Long, b: Long): Long {
        if (a == 0L) {
            return b
        }
        return gcd(b % a, a)
    }
}

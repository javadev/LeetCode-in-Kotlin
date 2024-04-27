package g3101_3200.s3115_maximum_prime_difference

// #Medium #Array #Math #Number_Theory #2024_04_27_Time_555_ms_(79.63%)_Space_87.6_MB_(94.44%)

import kotlin.math.sqrt

class Solution {
    fun maximumPrimeDifference(nums: IntArray): Int {
        val n = nums.size
        var i = 0
        while (i < n && check(nums[i])) {
            i++
        }
        var j = n - 1
        while (j >= 0 && check(nums[j])) {
            j--
        }
        return j - i
    }

    private fun check(n: Int): Boolean {
        if (n < 2) {
            return true
        }
        var i = 2
        while (i <= sqrt(n.toDouble())) {
            if (n % i == 0) {
                return true
            }
            i++
        }
        return false
    }
}

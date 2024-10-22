package g3301_3400.s3326_minimum_division_operations_to_make_array_non_decreasing

// #Medium #Array #Math #Greedy #Number_Theory
// #2024_10_22_Time_24_ms_(94.12%)_Space_64.2_MB_(64.71%)

import kotlin.math.max

class Solution {
    fun minOperations(nums: IntArray): Int {
        compute()
        var op = 0
        val n = nums.size
        for (i in n - 2 downTo 0) {
            while (nums[i] > nums[i + 1]) {
                if (SIEVE[nums[i]] == 0) {
                    return -1
                }
                nums[i] /= SIEVE[nums[i]]
                op++
            }
            if (nums[i] > nums[i + 1]) {
                return -1
            }
        }
        return op
    }

    companion object {
        private const val MAXI = 1000001
        private val SIEVE = IntArray(MAXI)
        private var precompute = false

        private fun compute() {
            if (precompute) {
                return
            }
            for (i in 2 until MAXI) {
                if (i * i > MAXI) {
                    break
                }
                var j = i * i
                while (j < MAXI) {
                    SIEVE[j] =
                        max(SIEVE[j], max(i, (j / i)))
                    j += i
                }
            }
            precompute = true
        }
    }
}

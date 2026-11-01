package g3901_4000.s3937_minimum_operations_to_make_array_modulo_alternating_i

// #Medium #Array #Enumeration #Senior #Biweekly_Contest_183
// #2026_09_29_Time_5_ms_(98.11%)_Space_44.80_MB_(86.79%)

import kotlin.math.abs
import kotlin.math.min

class Solution {
    fun minOperations(nums: IntArray, k: Int): Int {
        val even = IntArray(k)
        val odd = IntArray(k)
        for (i in nums.indices) {
            val rem = nums[i] % k
            for (j in 0..<k) {
                val diff = abs(rem - j)
                val cost = min(diff, k - diff)
                if (i % 2 == 0) {
                    even[j] += cost
                } else {
                    odd[j] += cost
                }
            }
        }
        var ans = Int.MAX_VALUE
        for (x in 0..<k) {
            for (y in 0..<k) {
                if (x != y) {
                    ans = min(ans, odd[x] + even[y])
                }
            }
        }
        return ans
    }
}

package g3401_3500.s3434_maximum_frequency_after_subarray_operation

// #Medium #2025_01_26_Time_51_(100.00%)_Space_56.51_(100.00%)

import kotlin.math.max

class Solution {
    fun maxFrequency(nums: IntArray, k: Int): Int {
        val count: MutableMap<Int?, Int?> = HashMap<Int?, Int?>()
        for (a in nums) {
            count.put(a, count.getOrDefault(a, 0)!! + 1)
        }
        var res = 0
        for (b in count.keys) {
            res = max(res, kadane(nums, k, b!!))
        }
        return count.getOrDefault(k, 0)!! + res
    }

    private fun kadane(nums: IntArray, k: Int, b: Int): Int {
        var res = 0
        var cur = 0
        for (a in nums) {
            if (a == k) {
                cur--
            }
            if (a == b) {
                cur++
            }
            if (cur < 0) {
                cur = 0
            }
            res = max(res, cur)
        }
        return res
    }
}

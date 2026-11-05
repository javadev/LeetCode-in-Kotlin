package g3901_4000.s3974_maximum_total_sum_of_k_selected_elements

import kotlin.math.max
import kotlin.math.min

// #Medium #Array #Sorting #Greedy #Senior #Weekly_Contest_508
// #2026_11_03_Time_18_ms_(98.38%)_Space_143.14_MB_(97.84%)

class Solution {
    fun maxSum(nums: IntArray, k: Int, mul: Int): Long {
        var k = k
        var mul = mul
        val count = IntArray(MAX)
        var max = nums[0]
        var sum: Long = 0
        for (n in nums) {
            max = max(max, n)
            count[n]++
        }
        while (max >= 0 && k > 0) {
            if (count[max] != 0) {
                var min = min(mul, count[max])
                min = min(k, min)
                k -= min
                mul -= min
                val local =
                    ((mul + min).toLong() * (mul + min + 1)) / 2 - (mul.toLong() * (mul + 1)) / 2
                sum += local * max
                if (mul == 0) {
                    count[max] -= min
                    break
                }
            }
            max--
        }
        while (max >= 0 && k > 0) {
            if (count[max] != 0) {
                val min = min(k, count[max])
                k -= min
                sum += max.toLong() * min
            }
            max--
        }
        return sum
    }

    companion object {
        private val MAX = 100000 + 1
    }
}

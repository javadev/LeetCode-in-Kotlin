package g3101_3200.s3139_minimum_cost_to_equalize_array

// #Hard #Array #Greedy #Enumeration #2024_05_07_Time_495_ms_(100.00%)_Space_60.4_MB_(100.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun minCostToEqualizeArray(nums: IntArray, cost1: Int, cost2: Int): Int {
        var max = 0L
        var min = Long.MAX_VALUE
        var sum = 0L
        for (num in nums) {
            if (num > max) {
                max = num.toLong()
            }
            if (num < min) {
                min = num.toLong()
            }
            sum += num
        }
        val n = nums.size
        var total = max * n - sum
        // When operation one is always better:
        if ((cost1 shl 1) <= cost2 || n <= 2) {
            return (total * cost1 % LMOD).toInt()
        }
        // When operation two is moderately better:
        var op1 = max(0L, (((max - min) shl 1L.toInt()) - total))
        var op2 = total - op1
        var result = (op1 + (op2 and 1L)) * cost1 + (op2 shr 1L.toInt()) * cost2
        // When operation two is significantly better:
        total += op1 / (n - 2L) * n
        op1 %= n - 2L
        op2 = total - op1
        result = min(result, ((op1 + (op2 and 1L)) * cost1 + (op2 shr 1L.toInt()) * cost2))
        // When operation two is always better:
        for (i in 0..1) {
            total += n.toLong()
            result = min(result, ((total and 1L) * cost1 + (total shr 1L.toInt()) * cost2))
        }
        return (result % LMOD).toInt()
    }

    companion object {
        private const val MOD = 1000000007
        private const val LMOD = MOD.toLong()
    }
}

package g3001_3100.s3091_apply_operations_to_make_sum_of_array_greater_than_or_equal_to_k

// #Medium #Math #Greedy #Enumeration #2024_04_18_Time_134_ms_(73.21%)_Space_33.2_MB_(98.21%)

import kotlin.math.sqrt

class Solution {
    fun minOperations(k: Int): Int {
        val a = sqrt(k.toDouble()).toInt()
        return a + (k - 1) / a - 1
    }
}

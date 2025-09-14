package g3601_3700.s3675_minimum_operations_to_transform_string

// #Medium #Weekly_Contest_466 #2025_09_14_Time_6_ms_(97.92%)_Space_57.75_MB_(43.75%)

class Solution {
    fun minOperations(s: String): Int {
        val n = s.length
        var ans = 0
        for (i in 0..<n) {
            val c = s[i]
            if (c != 'a') {
                val ops = 'z'.code - c.code + 1
                if (ops > ans) {
                    ans = ops
                }
                if (ops == 25) {
                    break
                }
            }
        }
        return ans
    }
}

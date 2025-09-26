package g3601_3700.s3681_maximum_xor_of_subsequences

// #Hard #Array #Math #Greedy #Bit_Manipulation #Biweekly_Contest_165
// #2025_09_20_Time_26_ms_(100.00%)_Space_76.00_MB_(77.78%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxXorSubsequences(nums: IntArray): Int {
        val n = nums.size
        if (n == 0) {
            return 0
        }
        var x = 0
        while (true) {
            var y = 0
            for (v in nums) {
                if (v > y) {
                    y = v
                }
            }
            if (y == 0) {
                return x
            }
            x = max(x, x xor y)
            for (i in 0..<n) {
                val v = nums[i]
                nums[i] = min(v, v xor y)
            }
        }
    }
}

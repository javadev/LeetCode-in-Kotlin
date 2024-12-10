package g3301_3400.s3379_transformed_array

// #Easy #Array #Simulation #2024_12_10_Time_206_ms_(84.38%)_Space_38.6_MB_(75.00%)

import kotlin.math.abs

class Solution {
    fun constructTransformedArray(nums: IntArray): IntArray {
        val n = nums.size
        val res = IntArray(n)
        for (i in 0..<n) {
            if (nums[i] > 0) {
                res[i] = nums[(i + nums[i]) % n]
            } else if (nums[i] < 0) {
                val r: Int = abs(nums[i]) / n
                res[i] = nums[abs(i + nums[i] + r * n + n) % n]
            }
        }
        return res
    }
}

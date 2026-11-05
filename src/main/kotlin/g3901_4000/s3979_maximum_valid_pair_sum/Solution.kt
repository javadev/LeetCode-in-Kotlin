package g3901_4000.s3979_maximum_valid_pair_sum

import kotlin.math.max

// #Medium #Array #Enumeration #Senior #Biweekly_Contest_186
// #2026_11_03_Time_2_ms_(59.68%)_Space_118.86_MB_(52.57%)

class Solution {
    fun maxValidPairSum(nums: IntArray, k: Int): Int {
        var res = 0
        var pre = 0
        val n = nums.size
        for (i in 0..<n - k) {
            pre = max(pre, nums[i])
            res = max(res, pre + nums[i + k])
        }
        return res
    }
}

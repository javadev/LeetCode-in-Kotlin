package g0901_1000.s0962_maximum_width_ramp

// #Medium #Array #Stack #Monotonic_Stack #2023_05_04_Time_324_ms_(100.00%)_Space_66.6_MB_(100.00%)

class Solution {
    fun maxWidthRamp(nums: IntArray): Int {
        val m = nums.size
        val dp = IntArray(m)
        var minInd = 0
        var ramp = 0
        for (i in 0 until m) {
            var prInd = minInd
            while (prInd > 0 && nums[i] >= nums[dp[prInd]]) {
                prInd = dp[prInd]
            }
            dp[i] = prInd
            if (nums[i] >= nums[prInd]) {
                ramp = ramp.coerceAtLeast(i - prInd)
            }
            minInd = if (nums[i] < nums[minInd]) i else minInd
        }
        return ramp
    }
}

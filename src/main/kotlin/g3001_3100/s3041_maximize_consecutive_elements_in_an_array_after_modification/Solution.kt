package g3001_3100.s3041_maximize_consecutive_elements_in_an_array_after_modification

// #Hard #Array #Dynamic_Programming #Sorting
// #2024_03_03_Time_13_ms_(100.00%)_Space_61.4_MB_(59.30%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxSelectedElements(nums: IntArray): Int {
        var max = 0
        var min = Int.MAX_VALUE
        for (x in nums) {
            max = max(x, max)
            min = min(x, min)
        }
        val count = IntArray(max + 1)
        for (x in nums) {
            ++count[x]
        }
        val dp = IntArray(max + 2)
        var ans = 0
        for (x in min..max) {
            if (count[x] == 0) {
                continue
            }
            val c = count[x]
            if (c == 1) {
                dp[x + 1] = dp[x] + 1
                dp[x] = dp[x - 1] + 1
            } else {
                dp[x] = dp[x - 1] + 1
                dp[x + 1] = dp[x] + 1
            }
            ans = max(ans, dp[x])
            ans = max(ans, dp[x + 1])
        }
        return ans
    }
}

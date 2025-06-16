package g3501_3600.s3584_maximum_product_of_first_and_last_elements_of_a_subsequence

// #Medium #2025_06_16_Time_8_ms_(100.00%)_Space_72.69_MB_(100.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maximumProduct(nums: IntArray, m: Int): Long {
        var ma = nums[0].toLong()
        var mi = nums[0].toLong()
        var res = nums[0].toLong() * nums[m - 1]
        for (i in m - 1..<nums.size) {
            ma = max(ma, nums[i - m + 1].toLong())
            mi = min(mi, nums[i - m + 1].toLong())
            res = max(res, max(mi * nums[i], ma * nums[i]))
        }
        return res
    }
}

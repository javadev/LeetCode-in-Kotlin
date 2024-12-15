package g3301_3400.s3388_count_beautiful_splits_in_an_array

// #Medium #2024_12_15_Time_165_ms_(100.00%)_Space_266.1_MB_(100.00%)

import kotlin.math.min

class Solution {
    fun beautifulSplits(nums: IntArray): Int {
        val n = nums.size
        val lcp = Array<IntArray?>(n + 1) { IntArray(n + 1) }
        for (i in n - 1 downTo 0) {
            for (j in n - 1 downTo 0) {
                if (nums[i] == nums[j]) {
                    lcp[i]!![j] = 1 + lcp[i + 1]!![j + 1]
                } else {
                    lcp[i]!![j] = 0
                }
            }
        }
        var res = 0
        for (i in 0..<n) {
            for (j in i + 1..<n) {
                if (i > 0) {
                    val lcp1 = min(min(lcp[0]!![i], i), (j - i))
                    val lcp2 = min(min(lcp[i]!![j], (j - i)), (n - j))
                    if (lcp1 >= i || lcp2 >= j - i) {
                        ++res
                    }
                }
            }
        }
        return res
    }
}

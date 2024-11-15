package g3301_3400.s3351_sum_of_good_subsequences

// #Hard #Array #Hash_Table #Dynamic_Programming
// #2024_11_15_Time_16_ms_(100.00%)_Space_61.2_MB_(80.00%)

import kotlin.math.max

class Solution {
    fun sumOfGoodSubsequences(nums: IntArray): Int {
        var max = 0
        for (x in nums) {
            max = max(x, max)
        }
        val count = LongArray(max + 3)
        val total = LongArray(max + 3)
        val mod = (1e9 + 7).toInt().toLong()
        var res: Long = 0
        for (a in nums) {
            count[a + 1] = (count[a] + count[a + 1] + count[a + 2] + 1) % mod
            val cur = total[a] + total[a + 2] + a * (count[a] + count[a + 2] + 1)
            total[a + 1] = (total[a + 1] + cur) % mod
            res = (res + cur) % mod
        }
        return res.toInt()
    }
}

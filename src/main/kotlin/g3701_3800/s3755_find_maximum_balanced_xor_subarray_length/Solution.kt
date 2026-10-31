package g3701_3800.s3755_find_maximum_balanced_xor_subarray_length

// #Medium #Array #Hash_Table #Bit_Manipulation #Prefix_Sum #Senior #Weekly_Contest_477
// #2026_04_25_Time_91_ms_(98.50%)_Space_256.08_MB_(93.23%)

import kotlin.math.max

class Solution {
    fun maxBalancedSubarray(nums: IntArray): Int {
        val n = nums.size
        var ans = 0
        var xor = 0
        var diff = n
        val pos: MutableMap<Long?, Int?> = HashMap<Long?, Int?>(n + 1, 1f)
        pos.put(xor.toLong() shl 20 or diff.toLong(), -1)
        for (i in 0..<n) {
            xor = xor xor nums[i]
            diff += if (nums[i] % 2 != 0) 1 else -1
            val key = xor.toLong() shl 20 or diff.toLong()
            val j = pos.get(key)
            if (j != null) {
                ans = max(ans, i - j)
            } else {
                pos.put(key, i)
            }
        }
        return ans
    }
}

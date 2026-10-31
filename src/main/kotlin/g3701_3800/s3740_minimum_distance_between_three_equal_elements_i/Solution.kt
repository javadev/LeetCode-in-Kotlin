package g3701_3800.s3740_minimum_distance_between_three_equal_elements_i

// #Easy #Array #Hash_Table #Mid_Level #Weekly_Contest_475
// #2026_04_26_Time_1_ms_(99.99%)_Space_44.21_MB_(75.36%)

import kotlin.math.min

class Solution {
    fun minimumDistance(nums: IntArray): Int {
        val len = nums.size
        val last2 = IntArray(len)
        var res = 200
        for (i in 0..<len) {
            val `val` = nums[i] - 1
            val pos = i + 1
            val pack = last2[`val`]
            val old = pack and 255
            val cur = pack shr 8
            last2[`val`] = cur or (pos shl 8)
            if (old > 0) {
                res = min(res, (pos - old) shl 1)
            }
        }
        return if (res == 200) -1 else res
    }
}

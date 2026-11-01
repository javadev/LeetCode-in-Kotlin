package g3801_3900.s3854_minimum_operations_to_make_array_parity_alternating

// #Medium #Array #Greedy #Staff #Biweekly_Contest_177
// #2026_07_27_Time_9_ms_(100.00%)_Space_146.36_MB_(88.24%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun makeParityAlternating(nums: IntArray): IntArray? {
        if (nums.size == 1) {
            return intArrayOf(0, 0)
        }
        var zero = 0
        var one = 0
        for (i in nums.indices) {
            if ((nums[i] and 1) != (i and 1)) {
                zero++
            }
            if ((nums[i] and 1) != ((i + 1) and 1)) {
                one++
            }
        }
        val ans = IntArray(2)
        ans[0] = min(one, zero)
        if (one == zero) {
            ans[1] = min(`fun`(nums, 0), `fun`(nums, 1))
        } else if (one > zero) {
            ans[1] = `fun`(nums, 0)
        } else {
            ans[1] = `fun`(nums, 1)
        }
        return ans
    }

    private fun `fun`(nums: IntArray, parity: Int): Int {
        var max = Int.MIN_VALUE
        var min = Int.MAX_VALUE
        for (i in nums.indices) {
            if ((nums[i] and 1) == ((i + parity) and 1)) {
                max = max(max, nums[i])
                min = min(min, nums[i])
            } else {
                max = max(max, nums[i] - 1)
                min = min(min, nums[i] + 1)
            }
        }
        return max(max - min, 1)
    }
}

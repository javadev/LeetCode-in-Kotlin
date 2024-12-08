package g3301_3400.s3376_minimum_time_to_break_locks_i

// #Medium #2024_12_08_Time_202_ms_(100.00%)_Space_40_MB_(100.00%)

import kotlin.math.min

class Solution {
    fun findMinimumTime(strength: List<Int>, k: Int): Int {
        val perm: MutableList<Int> = ArrayList<Int>(strength)
        perm.sort()
        var minTime = Int.Companion.MAX_VALUE
        do {
            var time = 0
            var factor = 1
            for (required in perm) {
                val neededTime = (required + factor - 1) / factor
                time += neededTime
                factor += k
            }
            minTime = min(minTime, time)
        } while (nextPermutation(perm))
        return minTime
    }

    private fun nextPermutation(nums: MutableList<Int>): Boolean {
        var i = nums.size - 2
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--
        }
        if (i < 0) {
            return false
        }
        var j = nums.size - 1
        while (nums[j] <= nums[i]) {
            j--
        }
        nums[j] = nums[i]
        nums.subList(i + 1, nums.size).reverse()
        return true
    }
}

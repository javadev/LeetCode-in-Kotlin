package g0401_0500.s0473_matchsticks_to_square

// #Medium #Array #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask
// #2022_12_31_Time_255_ms_(100.00%)_Space_33.9_MB_(100.00%)

import java.util.Arrays

class Solution {
    fun makesquare(matchsticks: IntArray): Boolean {
        if (matchsticks.size < 4) {
            return false
        }
        var per = 0
        for (ele in matchsticks) {
            per = ele + per
        }
        if (per % 4 != 0) {
            return false
        }
        Arrays.sort(matchsticks)
        val side = per / 4
        val sides = intArrayOf(side, side, side, side)
        return help(matchsticks, matchsticks.size - 1, sides)
    }

    private fun help(nums: IntArray, i: Int, side: IntArray): Boolean {
        if (i == -1) {
            return side[0] == 0 && side[1] == 0 && side[2] == 0 && side[3] == 0
        }
        for (j in 0..3) {
            if (nums[i] > side[j]) {
                continue
            }
            side[j] -= nums[i]
            if (help(nums, i - 1, side)) {
                return true
            }
            side[j] += nums[i]
        }
        return false
    }
}

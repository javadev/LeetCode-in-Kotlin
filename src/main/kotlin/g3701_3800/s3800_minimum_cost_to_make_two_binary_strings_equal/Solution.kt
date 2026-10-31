package g3701_3800.s3800_minimum_cost_to_make_two_binary_strings_equal

// #Medium #String #Greedy #Staff #Weekly_Contest_483
// #2026_05_22_Time_8_ms_(85.71%)_Space_47.61_MB_(85.71%)

import kotlin.math.min

class Solution {
    fun minimumCost(s: String, t: String, flipCost: Int, swapCost: Int, crossCost: Int): Long {
        val len = t.length
        var diff = 0
        var one = 0
        var zero = 0
        val arr1 = s.toCharArray()
        val arr2 = t.toCharArray()
        for (i in 0..<len) {
            if (arr1[i] != arr2[i]) {
                diff++
                if (arr1[i] == '0') {
                    zero++
                } else {
                    one++
                }
            }
        }
        val min = min(one, zero)
        var ans: Long = 0
        val costOfFlip = (min.toLong() * flipCost) * 2
        val costOfSwap = (min.toLong() * swapCost)
        ans += min(costOfFlip, costOfSwap)
        diff -= (min * 2)
        val oddLeft = diff % 2
        val evenLeft = diff - oddLeft
        val costOfCrossSwap =
            (((evenLeft / 2).toLong() * crossCost) + ((evenLeft / 2).toLong() * swapCost))
        val costOfFlipMain = (evenLeft.toLong() * flipCost)
        ans += min(costOfCrossSwap, costOfFlipMain)
        ans += oddLeft.toLong() * flipCost
        return ans
    }
}

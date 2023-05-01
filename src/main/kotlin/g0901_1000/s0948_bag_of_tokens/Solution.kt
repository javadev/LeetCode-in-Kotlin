package g0901_1000.s0948_bag_of_tokens

// #Medium #Array #Sorting #Greedy #Two_Pointers
// #2023_05_01_Time_161_ms_(100.00%)_Space_37.4_MB_(33.33%)

import java.util.Arrays

@Suppress("NAME_SHADOWING")
class Solution {
    fun bagOfTokensScore(tokens: IntArray, power: Int): Int {
        var power = power
        Arrays.sort(tokens)
        var score = 0
        var l = 0
        var r = tokens.size - 1
        while (l <= r) {
            if (tokens[l] <= power) {
                power -= tokens[l]
                score++
                l++
            } else {
                if (r - l == 0) {
                    return score
                }
                if (score >= 1) {
                    power += tokens[r]
                    score--
                    r--
                } else {
                    return 0
                }
            }
        }
        return score
    }
}

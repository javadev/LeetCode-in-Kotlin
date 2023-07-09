package g2501_2600.s2568_minimum_impossible_or

// #Medium #Array #Bit_Manipulation #Brainteaser
// #2023_07_09_Time_468_ms_(100.00%)_Space_52.2_MB_(100.00%)

class Solution {
    fun minImpossibleOR(nums: IntArray): Int {
        val pow2s = nums.filter {
            it and (it - 1) == 0
        }.toSet()
        return 1 shl (0..31).first {
            (1 shl it) !in pow2s
        }
    }
}

package g0801_0900.s0810_chalkboard_xor_game

// #Hard #Array #Math #Bit_Manipulation #Game_Theory #Brainteaser
// #2023_03_17_Time_172_ms_(100.00%)_Space_37_MB_(33.33%)

class Solution {
    fun xorGame(nums: IntArray): Boolean {
        var xor = 0
        for (i in nums) {
            xor = xor xor i
        }
        return xor == 0 || nums.size and 1 == 0
    }
}

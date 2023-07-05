package g0001_0100.s0045_jump_game_ii

// #Medium #Top_100_Liked_Questions #Array #Dynamic_Programming #Greedy
// #Algorithm_II_Day_13_Dynamic_Programming #Dynamic_Programming_I_Day_4
// #2023_07_05_Time_208_ms_(93.37%)_Space_38.2_MB_(94.48%)

class Solution {
    fun jump(nums: IntArray): Int {
        var length = 0
        var maxLength = 0
        var minJump = 0
        for (i in 0 until nums.size - 1) {
            length--
            maxLength--
            maxLength = Math.max(maxLength, nums[i])
            if (length <= 0) {
                length = maxLength
                minJump++
            }
            if (length >= nums.size - i - 1) {
                return minJump
            }
        }
        return minJump
    }
}

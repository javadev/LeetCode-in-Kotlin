package g0001_0100.s0045_jump_game_ii

// #Medium #Top_100_Liked_Questions #Array #Dynamic_Programming #Greedy
// #Algorithm_II_Day_13_Dynamic_Programming #Dynamic_Programming_I_Day_4
// #2022_08_27_Time_231_ms_(98.08%)_Space_36.8_MB_(100.00%)

class Solution {
    fun jump(nums: IntArray): Int {
        var jumps = 0
        var minJump = 0
        var maxJump = 0

        while (maxJump < nums.lastIndex) {
            var nextJump = 0
            for (i in minJump..maxJump) nextJump = maxOf(nextJump, i + nums[i])
            minJump = maxJump + 1
            maxJump = nextJump
            jumps++
        }

        return jumps
    }
}

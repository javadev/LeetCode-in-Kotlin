package g0001_0100.s0055_jump_game

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Dynamic_Programming #Greedy
// #Algorithm_II_Day_12_Dynamic_Programming #Dynamic_Programming_I_Day_4 #Udemy_Arrays
// #2022_08_29_Time_607_ms_(78.55%)_Space_71.5_MB_(41.76%)

class Solution {
    fun canJump(nums: IntArray): Boolean {
        val size = nums.size
        var maximumJumpIndex = 0

        for (i in 0 until size) {
            if (i > maximumJumpIndex) {
                break
            }

            maximumJumpIndex = Math.max(maximumJumpIndex, i + nums[i])
        }

        return maximumJumpIndex >= size - 1
    }
}

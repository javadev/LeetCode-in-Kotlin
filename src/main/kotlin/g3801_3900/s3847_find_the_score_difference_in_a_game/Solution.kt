package g3801_3900.s3847_find_the_score_difference_in_a_game

// #Medium #Array #Simulation #Senior #Weekly_Contest_490
// #2026_07_22_Time_1_ms_(100.00%)_Space_46.89_MB_(71.53%)

class Solution {
    fun scoreDifference(nums: IntArray): Int {
        var player = 0
        val scores = intArrayOf(0, 0)
        for (game in 1..nums.size) {
            player = player xor ((nums[game - 1] % 2) xor (if (game % 6 == 0) 1 else 0))
            scores[player] += nums[game - 1]
        }
        return scores[0] - scores[1]
    }
}

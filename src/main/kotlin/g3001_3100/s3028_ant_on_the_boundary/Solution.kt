package g3001_3100.s3028_ant_on_the_boundary

// #Easy #Array #Simulation #Prefix_Sum #2024_03_03_Time_155_ms_(87.32%)_Space_35.1_MB_(61.97%)

class Solution {
    fun returnToBoundaryCount(nums: IntArray): Int {
        var diff: Long = 0
        var res = 0
        for (n in nums) {
            diff += n.toLong()
            // since n is non-zero, so prev diff is not zero,
            // when current diff is zero.
            if (diff == 0L) res++
        }
        return res
    }
}

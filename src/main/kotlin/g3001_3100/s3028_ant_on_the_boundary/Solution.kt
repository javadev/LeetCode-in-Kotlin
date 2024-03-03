package g3001_3100.s3028_ant_on_the_boundary

// #Easy #Array #Simulation #Prefix_Sum #2024_03_01_Time_0_ms_(100.00%)_Space_42.1_MB_(53.10%)

class Solution {
    fun returnToBoundaryCount(nums: IntArray): Int {
        var ans = 0
        var num = 0
        for (n in nums) {
            num += n
            if (num == 0) {
                ans++
            }
        }
        return ans
    }
}

package g1601_1700.s1646_get_maximum_in_generated_array

// #Easy #Array #Dynamic_Programming #Simulation
// #2023_06_18_Time_142_ms_(100.00%)_Space_32.7_MB_(100.00%)

class Solution {
    fun getMaximumGenerated(n: Int): Int {
        if (n == 0) {
            return 0
        }
        val nums = IntArray(n + 1)
        nums[0] = 0
        nums[1] = 1
        var max = 1
        for (i in 1..n / 2) {
            nums[i * 2] = nums[i]
            max = Math.max(max, nums[i])
            if (i * 2 + 1 <= n) {
                nums[i * 2 + 1] = nums[i] + nums[i + 1]
                max = Math.max(max, nums[i * 2 + 1])
            }
        }
        return max
    }
}

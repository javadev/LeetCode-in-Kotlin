package g4001_4100.s4044_count_good_cyclic_rotations

// #Medium #Array #Prefix_Sum #Sliding_Window #Senior #Weekly_Contest_518
// #2026_11_25_Time_3_ms_(98.00%)_Space_71.09_MB_(63.67%)

class Solution {
    fun countGoodRotations(nums: IntArray): Int {
        var leftsum: Long = 0
        var rightsum: Long = 0
        val n = nums.size
        var count = 0
        for (i in 0..<n / 2) {
            leftsum += nums[i].toLong()
            rightsum += nums[n - 1 - i].toLong()
        }
        var left = 0
        var right = n / 2
        while (right < n) {
            leftsum = leftsum - nums[left] + nums[right]
            rightsum = rightsum - nums[right] + nums[left]
            left++
            right++
            if (leftsum != rightsum) {
                count++
            }
        }
        return count
    }
}

package g2201_2300.s2210_count_hills_and_valleys_in_an_array

// #Easy #Array #2023_06_27_Time_153_ms_(80.00%)_Space_33.7_MB_(100.00%)

class Solution {
    fun countHillValley(nums: IntArray): Int {
        var left = nums[0]
        var count = 0
        for (i in 1 until nums.size - 1) {
            if (left > nums[i] && nums[i + 1] > nums[i] || left < nums[i] && nums[i + 1] < nums[i]) {
                count++
                left = nums[i]
            }
        }
        return count
    }
}

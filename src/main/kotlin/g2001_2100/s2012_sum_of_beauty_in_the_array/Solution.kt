package g2001_2100.s2012_sum_of_beauty_in_the_array

// #Medium #Array #2023_06_23_Time_511_ms_(100.00%)_Space_56.5_MB_(50.00%)

class Solution {
    fun sumOfBeauties(nums: IntArray): Int {
        val maxArr = IntArray(nums.size)
        maxArr[0] = nums[0]
        for (i in 1 until nums.size - 1) {
            maxArr[i] = Math.max(maxArr[i - 1], nums[i])
        }
        val minArr = IntArray(nums.size)
        minArr[nums.size - 1] = nums[nums.size - 1]
        for (i in nums.size - 2 downTo 0) {
            minArr[i] = Math.min(minArr[i + 1], nums[i])
        }
        var sum = 0
        for (i in 1 until nums.size - 1) {
            if (nums[i] > maxArr[i - 1] && nums[i] < minArr[i + 1]) {
                sum += 2
            } else if (nums[i] > nums[i - 1] && nums[i] < nums[i + 1]) {
                sum += 1
            }
        }
        return sum
    }
}

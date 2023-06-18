package g1701_1800.s1800_maximum_ascending_subarray_sum

// #Easy #Array #2023_06_18_Time_139_ms_(100.00%)_Space_34.2_MB_(83.33%)

class Solution {
    fun maxAscendingSum(nums: IntArray): Int {
        var maxSum = nums[0]
        var i = 0
        var j = i + 1
        while (i < nums.size - 1 && j < nums.size) {
            var sum = nums[j - 1]
            while (j < nums.size && nums[j] - nums[j - 1] > 0) {
                sum += nums[j]
                j++
            }
            i = j
            maxSum = Math.max(maxSum, sum)
            j++
        }
        return maxSum
    }
}

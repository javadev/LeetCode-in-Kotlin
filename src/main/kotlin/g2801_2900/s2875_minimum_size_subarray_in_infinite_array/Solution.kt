package g2801_2900.s2875_minimum_size_subarray_in_infinite_array

// #Medium #Array #Hash_Table #Prefix_Sum #Sliding_Window
// #2023_12_25_Time_372_ms_(100.00%)_Space_52.6_MB_(100.00%)

import kotlin.math.min

class Solution {
    fun minSizeSubarray(nums: IntArray, target: Int): Int {
        var sum = 0
        for (num in nums) {
            sum += num
        }
        if (sum == 0) {
            return -1
        }
        val result = (target / sum) * nums.size
        sum = target % sum
        var currentSum = 0
        var min = nums.size
        var start = 0
        for (i in 0 until nums.size * 2) {
            currentSum += nums[i % nums.size]
            while (currentSum > sum) {
                currentSum -= nums[start % nums.size]
                start++
            }
            if (currentSum == sum) {
                min = min(min, i - start + 1)
            }
        }
        if (min == nums.size) {
            return -1
        }
        return result + min
    }
}

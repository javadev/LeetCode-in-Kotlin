package g1601_1700.s1658_minimum_operations_to_reduce_x_to_zero

// #Medium #Array #Hash_Table #Binary_Search #Prefix_Sum #Sliding_Window
// #2023_06_15_Time_532_ms_(50.00%)_Space_53_MB_(100.00%)

class Solution {
    fun minOperations(nums: IntArray, x: Int): Int {
        var totalArraySum = 0
        for (each in nums) {
            totalArraySum += each
        }
        if (totalArraySum == x) {
            return nums.size
        }
        val target = totalArraySum - x
        // as we need to find value equal to x so that x-x=0,
        // and we need to search the longest sub array with sum equal t0 total array sum -x;
        var sum = 0
        var result = -1
        var start = 0
        for (end in nums.indices) {
            sum += nums[end]
            while (sum > target && start < nums.size) {
                sum -= nums[start]
                start++
            }
            if (sum == target) {
                result = Math.max(result, end + 1 - start)
            }
        }
        return if (result == -1) {
            result
        } else {
            nums.size - result
        }
    }
}

package g2401_2500.s2439_minimize_maximum_of_array

// #Medium #Array #Dynamic_Programming #Greedy #Binary_Search #Prefix_Sum
// #2023_07_05_Time_508_ms_(100.00%)_Space_61.5_MB_(50.00%)

class Solution {
    fun minimizeArrayValue(nums: IntArray): Int {
        var max: Long = 0
        var sum: Long = 0
        for (i in nums.indices) {
            sum += nums[i].toLong()
            max = Math.max(max, (sum + i) / (i + 1))
        }
        return max.toInt()
    }
}

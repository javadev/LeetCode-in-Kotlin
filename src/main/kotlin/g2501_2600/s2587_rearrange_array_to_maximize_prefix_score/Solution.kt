package g2501_2600.s2587_rearrange_array_to_maximize_prefix_score

// #Medium #Array #Sorting #Greedy #Prefix_Sum
// #2023_07_11_Time_612_ms_(100.00%)_Space_61_MB_(100.00%)

class Solution {
    fun maxScore(nums: IntArray): Int {
        nums.sort()
        var count = 0
        var sum: Long = 0
        for (i in nums.indices.reversed()) {
            sum += nums[i].toLong()
            if (sum > 0) count++
        }
        return count
    }
}

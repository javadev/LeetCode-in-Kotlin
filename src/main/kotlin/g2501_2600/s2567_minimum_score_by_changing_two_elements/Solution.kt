package g2501_2600.s2567_minimum_score_by_changing_two_elements

// #Medium #Array #Sorting #Greedy #2023_07_08_Time_496_ms_(100.00%)_Space_58.2_MB_(100.00%)

class Solution {
    fun minimizeSum(nums: IntArray): Int {
        nums.sort()
        return (0 until 3).map {
            nums[nums.size - 3 + it] - nums[it]
        }.min()
    }
}
